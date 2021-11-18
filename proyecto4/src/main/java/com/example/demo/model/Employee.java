package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_estacion")
public class Employee {

	
	private long id;
    private String nombre;
    private String estacion;
 
    public Employee() {
  
    }
 

    public Employee(long id, String nombre, String estacion) {
		this.id = id;
		this.nombre = nombre;
		this.estacion = estacion;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "Nombre", nullable = false)
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    @Column(name = "Estación", nullable = false)
	public String getEstacion() {
		return estacion;
	}
	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}

	

    @Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", estacion=" + estacion + "]";
	}
}
