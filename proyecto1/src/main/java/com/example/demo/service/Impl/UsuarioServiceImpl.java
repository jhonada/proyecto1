package com.example.demo.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	}

	

}
