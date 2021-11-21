package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario_estacion")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long Id;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Estacion")
	private String Estacion;
	
	
	public Usuario(long id, String nombre, String estacion) {
		Id = id;
		Nombre = nombre;
		Estacion = estacion;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getEstacion() {
		return Estacion;
	}
	public void setEstacion(String estacion) {
		Estacion = estacion;
	}

}
