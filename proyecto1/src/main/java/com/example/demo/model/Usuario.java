package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario_estacion")
public class Usuario {
	
	@Id
	@GeneratedValue()
	@Column(name="Id")
	private Long Id;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Estación")
	private String Estacion;
	
	
	public Usuario(long id, String nombre, String estación) {
		Id = id;
		Nombre = nombre;
		Estacion = estación;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
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
	public void setEstación(String estacion) {
		Estacion = estacion;
	}
	@Override
	public String toString() {
		return "Notas [Id=" + Id + ", Nombre=" + Nombre + ", Estación=" + Estacion + "]";
	}

}
