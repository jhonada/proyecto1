package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Usuario;

public interface UsuarioService{
	
	
	public abstract List<Usuario> listAllUsuario();
	public abstract Usuario addUsuario(Usuario usuario); 
	public abstract Usuario findUsuarioById(Long id);
	public abstract void removerUsuario(Long id);

}
