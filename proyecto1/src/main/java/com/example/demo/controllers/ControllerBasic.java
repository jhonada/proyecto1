package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.UsuarioService;


@Controller
@RequestMapping("/hola")
public class ControllerBasic {
	
	
	//@Autowired
	//private UsuarioService usuarioService;

	/*
    public ControllerBasic(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
	*/
	@GetMapping(path = "/electronica")
	public String saludar() {
		return "index";
	}
	
	@GetMapping(path = "/saludar")
	public String holar() {
		return "holaMundo";
	}
	
	/*@Operation(summary = "Se registran datos de la estacion y se imprimen")
	@PostMapping("/postPersona")
	public String postPersona(@RequestBody persona dato) {
		return "Datos Generales: "+dato.prueba();
	}
	*/
	@GetMapping(path = "/cursos")
	public String listAllUsuarios() {
		
		ModelAndView mav = new ModelAndView("list");
		//mav.addObject("usuarios", usuarioService.listAllUsuario());
		//mav.addObject("user", new Usuario());
		return "list";
	}
	/*
    @GetMapping("/cursos")
    public String getAllUsuario() {
        return "list";
    }*/
	
	/*@GetMapping(path = "/Usuario_Estacion")
	public String Usuario_Estacion() {
		return "Usuario_Estacion.html";
	}*/
	  

	
}


