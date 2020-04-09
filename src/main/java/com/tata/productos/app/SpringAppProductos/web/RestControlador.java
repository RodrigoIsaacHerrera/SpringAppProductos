package com.tata.productos.app.SpringAppProductos.web;

import com.tata.productos.app.SpringAppProductos.core.model.ProductoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControlador {
    @Autowired
    ProductoRepositoryDAO dao;


}
