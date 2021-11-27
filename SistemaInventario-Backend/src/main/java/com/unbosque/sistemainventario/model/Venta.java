package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "venta")
public class Venta {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idVenta;
    @Column (name = "cantidadVenta")
    private int cantidadVenta;
    @Column (name = "fechaVenta")
    private String fechaVenta;
    @Column (name = "valorVenta")
    private double valorVenta;
}