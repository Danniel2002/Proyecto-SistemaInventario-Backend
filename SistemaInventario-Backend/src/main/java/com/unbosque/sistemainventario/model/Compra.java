package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "compra")
public class Compra {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idCompra;
    @Column (name = "cantidadCompra")
    private int cantidadCompra;
    @Column (name = "valorCompra")
    private double valorCompra;


}