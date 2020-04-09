package com.tata.productos.app.SpringAppProductos.core.model;

import com.tata.productos.app.SpringAppProductos.core.model.ProductoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositoryDAO extends JpaRepository<ProductoDTO, Integer> {
}
