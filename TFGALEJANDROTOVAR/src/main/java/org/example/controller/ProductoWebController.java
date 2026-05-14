package org.example.controller;

import org.example.entity.Producto;
import org.example.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductoWebController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/inventario")
    public String listar(Model model) {
        model.addAttribute("lista", productoService.obtenerTodos());
        return "inventario";
    }

    // Muestra el formulario para crear un nuevo producto
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("producto", new Producto());
        return "formulario-producto";
    }

    // Guarda el producto (sirve para crear y para editar)
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("producto") Producto producto) {
        productoService.guardar(producto);
        return "redirect:/inventario";
    }

    // Muestra el formulario para editar
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        Producto p = productoService.obtenerPorId(id);
        model.addAttribute("producto", p);
        return "formulario-producto";
    }

    // Elimina el producto
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        productoService.eliminar(id);
        return "redirect:/inventario";
    }

    // --- NUEVO MÉTODO PARA EL QR ---
    // Este método es público (gracias al cambio en SecurityConfig)
    @GetMapping("/producto/detalle/{id}")
    public String verDetallePublico(@PathVariable("id") Integer id, Model model) {

        Producto p = productoService.obtenerPorId(id);


        model.addAttribute("p", p);


        return "detalle-producto";
    }
}