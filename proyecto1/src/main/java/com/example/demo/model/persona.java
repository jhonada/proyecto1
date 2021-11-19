package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;

//@Entity
public class persona implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String estacion;


	public persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public persona(Integer id, String nombre, String estacion) {
		this.id = id;
		this.nombre = nombre;
		this.estacion = estacion;
	}
	
	
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

	public String getEstacion() {
		return estacion;
	}

	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}


	public String prueba() {
		return "persona [id=" + id + ", nombre=" + nombre + ", estacion=" + estacion + "]";
	}


}
