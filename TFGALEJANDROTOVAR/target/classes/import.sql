INSERT INTO usuarios (usuario, password, rol) VALUES ('admin', '$2a$10$NpbqI8XzysB.2DbiKWLg5.fGnfwXNbapXMYSkof5.IU3MFMYEkDXK', 'ADMIN');
INSERT INTO usuarios (usuario, password, rol) VALUES ('usuario', '$2a$10$NpbqI8XzysB.2DbiKWLg5.fGnfwXNbapXMYSkof5.IU3MFMYEkDXK', 'USER');
INSERT INTO productos (nombre, marca, precio, stock) VALUES ('Nike Air Max', 'Nike', 120.99, 10);
INSERT INTO productos (nombre, marca, precio, stock) VALUES ('Adidas Ultraboost', 'Adidas', 180.50, 3);
INSERT INTO productos (nombre, marca, precio, stock) VALUES ('New Balance 550', 'New Balance', 110.00, 15);
select * from usuarios;