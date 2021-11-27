package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idProducto;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "precioVenta")
    private double precioVenta;
    @Column (name = "precioCompra")
    private double precioCompra;
    @Column (name = "stock")
    private int stock;


    public Producto() {     }


    public Producto(String nombre, double precioVenta, double precioCompra, int stock) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.stock = stock;
    }

    
    public long getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}