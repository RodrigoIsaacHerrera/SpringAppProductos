package com.tata.productos.app.SpringAppProductos.web;

import com.tata.productos.app.SpringAppProductos.core.model.ProductoDTO;
import com.tata.productos.app.SpringAppProductos.core.model.ProductoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControlador {
    @Autowired
    ProductoRepositoryDAO dao;

    @GetMapping("/Productos")
    public List<ProductoDTO> getListaProductos(){

        return this.dao.findAll();

    }
    @PostMapping("/Productos/RegistrarProducto")
    public boolean addProducto(@RequestBody ProductoDTO nuevo){
        if(!this.dao.existsById(nuevo.getId())) {
            this.dao.save(nuevo);
            return true;
        }
        return false;
    }
    @DeleteMapping("/EliminarProducto/{id}")
    public boolean deleteProducto(@PathVariable Integer id){
        this.dao.deleteById(id);
        return !this.dao.existsById(id);
    }



}
