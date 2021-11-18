package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;

@Service
public interface UsuarioService {
	
	
	public abstract List<Usuario> listAllUsuario();
	public abstract Usuario addUsuario(Usuario usuario); 

}
