package com.tata.productos.app.SpringAppProductos.core.model;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String  nombre;
    @Column(name = "tipo")
    private String  tipo;
    //CONSTRUCTOR
    public ProductoDTO(Integer id, String nombre, String tipo) {
        this.id = null;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    //GETTERS AND SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
