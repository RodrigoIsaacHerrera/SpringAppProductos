package com.tata.productos.app.SpringAppProductos.web;

import com.tata.productos.app.SpringAppProductos.core.model.ProductoDTO;
import com.tata.productos.app.SpringAppProductos.core.model.ProductoRepositoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControlador {
    @Autowired
    ProductoRepositoryDAO dao;

    @GetMapping("/products")
    public List<ProductoDTO> getListaProductos(){
        return this.dao.findAll();
    }
    @GetMapping("/products/name/{name}")
    public List<ProductoDTO> getProductoByName(@PathVariable String name){
        this.dao.findByName(name).forEach(x -> System.out.println("el elemento fue encontrado \n" + x));
        return this.dao.findByName(name);
    }
    @GetMapping("/products/byid/{id}")
    public String getProductoById(@PathVariable Integer id){
        this.dao.findById(id).ifPresent(x -> System.out.println("el elemento fue encontrado \n" + x));
        return this.dao.findById(id).toString();
    }

    @PostMapping("/products/registerProduct")
    public boolean addProducto(@RequestBody ProductoDTO nuevo){

        if(!this.dao.existsById(nuevo.getId())) {
            this.dao.save(nuevo);
            return true;
        }
        return false;
    }
    @PutMapping("/products/updateProduct")
    public boolean updateProducto(@RequestBody ProductoDTO modificado){
        if(this.dao.existsById(modificado.getId())){
            this.dao.save(modificado);
            return true;
        }
        return false;
    }
    @DeleteMapping("/products/deleteProduct/{id}")
    public boolean deleteProducto(@PathVariable Integer id){
        this.dao.deleteById(id);
        return !this.dao.existsById(id);
    }

}
