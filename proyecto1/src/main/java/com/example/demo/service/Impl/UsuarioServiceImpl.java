package com.example.demo.service.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.UsuarioService;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public List<Usuario> listAllUsuario() {

		return usuarioRepository.findAll();
	}

	@Override
	public Usuario addUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

}
