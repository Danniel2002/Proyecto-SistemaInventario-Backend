package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idProveedor;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "telefono")
    private String telefono;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "ciudad")
    private String ciudad;
    
}
