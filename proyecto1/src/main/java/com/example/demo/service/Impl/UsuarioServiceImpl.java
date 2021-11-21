package com.example.demo.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.UsuarioService;

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

	@Override
	public Usuario findUsuarioById(Long id) {
		
		return usuarioRepository.findById(id).get();
	}

	@Override
	public void removerUsuario(Long id) {
		
		usuarioRepository.deleteById(id);
		
		/*
		Optional<Usuario> us = findUsuarioById(id);
		
		if(null != us) {
			usuarioRepository.delete(us);
		}*/
		
	}

	

}
