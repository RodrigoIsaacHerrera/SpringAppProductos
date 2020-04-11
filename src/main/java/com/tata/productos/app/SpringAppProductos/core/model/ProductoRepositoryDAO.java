package com.tata.productos.app.SpringAppProductos.core.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ProductoRepositoryDAO extends JpaRepository<ProductoDTO, Integer> {

    Optional<ProductoDTO> findById(Integer id);
    Optional<ProductoDTO> findByName(String name);
    Optional<ProductoDTO> findByType(String type);
    List<ProductoDTO> findAll();


}
