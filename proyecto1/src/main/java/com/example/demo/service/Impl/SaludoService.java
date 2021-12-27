package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
	
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }
    
    public String despedir(String nombre) {
        return "Hasta luego " + nombre;
    }

}