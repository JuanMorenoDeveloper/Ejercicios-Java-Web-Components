package com.proitc.bean;

public class Producto {
	private String nombre;
	private double price;
	public Producto(){
		this("Default", 0.0);
	}
	public Producto(String nombre,double price){
		this.nombre=nombre;
		this.price=price;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
