package com.unbosque.sistemainventario.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "reporte")
public class Reporte {
	@Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idReporte;
	@Column (name = "fecha")
    private String fecha;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "tipo")
    private String tipo;
    @Column (name = "cantidad")
    private int cantidad;
    @Column (name = "precio")
    private double precio;
    @Column (name = "total")
    private double total;
    
    public Reporte() {

    }
    public Reporte(String fecha,String nombre,String tipo,int cantidad,double precio,double total) {
    	this.fecha=fecha;
    	this.nombre=nombre;
    	this.tipo=tipo;
    	this.cantidad=cantidad;
    	this.precio=precio;
    	this.total=total;
    }
	public long getIdReporte() {
		return idReporte;
	}
	public void setIdReporte(long idReporte) {
		this.idReporte = idReporte;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
    
}


