package com.ejemplo.teoria;

public class Cliente {
	String nombre;
	String ciudad;
	int facturas;
	public Cliente(String nombre, String ciudad, int facturas) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.facturas = facturas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getFacturas() {
		return facturas;
	}
	public void setFacturas(int facturas) {
		this.facturas = facturas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", ciudad=" + ciudad + ", facturas=" + facturas + "]";
	}
	
	
	
}
