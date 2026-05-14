
package org.example.controller;

import org.example.entity.Producto;
import org.example.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;



    @GetMapping("/todos")
    public List<Producto> obtenerTodos() {
        return productoService.obtenerTodos();
    }

    @GetMapping("/stock/{idProducto}")
    public Producto obtener(int idProducto) {
        return null;
    }
}