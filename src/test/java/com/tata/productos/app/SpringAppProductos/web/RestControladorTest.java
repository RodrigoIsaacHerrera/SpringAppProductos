package com.tata.productos.app.SpringAppProductos.web;

import com.tata.productos.app.SpringAppProductos.SpringAppProductosApplication;
import com.tata.productos.app.SpringAppProductos.core.model.ProductoDTO;
import com.tata.productos.app.SpringAppProductos.core.model.ProductoRepositoryDAO;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RestControladorTest extends SpringAppProductosApplication {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductoRepositoryDAO repository;
    @org.junit.Before
    public void setUp() throws Exception {
        entityManager.persist(new ProductoDTO(1,"Xiaomi 344", "Smart Phone"));
    }

    @org.junit.Test
    public void addProducto() {


    }
    @org.junit.Test
    public void deleteProducto() {
    }
    @org.junit.Test
    public void getListaProductos() {
    }
}