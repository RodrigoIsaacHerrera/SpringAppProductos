package com.tata.productos.app.SpringAppProductos.core.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductoRepositoryDAO extends JpaRepository<ProductoDTO, Integer> {

    List<ProductoDTO> findByName(String name) throws Exception;
    List<ProductoDTO> findByType(String type) throws Exception;

}
