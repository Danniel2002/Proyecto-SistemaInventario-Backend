package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categoria")
public class Categoria {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idCategoria;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "descripcion")
    private String descripcion;
}
