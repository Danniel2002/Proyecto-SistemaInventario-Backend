package com.unbosque.sistemainventario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idCargo;
    @Column (name = "descripcion")
    private String descripcion;

    public Cargo() {    }

    public Cargo(long idCargo, String descripcion) {
        this.idCargo = idCargo;
        this.descripcion = descripcion;
    }

    public long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(long idCargo) {
        this.idCargo = idCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}