package com.tata.productos.app.SpringAppProductos.core.model;

import javax.persistence.*;

@Entity
public class ProductoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  name;
    private String  type;
    //CONSTRUCTORS

    public ProductoDTO() {
    }

    public ProductoDTO(Integer id, String nombre, String tipo) {
        this.id = null;
        this.name = nombre;
        this.type = tipo;
    }
    //GETTERS AND SETTERS


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
