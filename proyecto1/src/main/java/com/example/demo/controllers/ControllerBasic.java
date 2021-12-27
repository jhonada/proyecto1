package com.example.demo.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.AspectPoint;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import com.example.demo.service.Impl.AspectService;
import com.example.demo.service.Impl.SaludoService;


@Controller
@RequestMapping("/hola")
public class ControllerBasic {
	
	
	@Autowired
	private UsuarioService usuarioService;

	
	@Autowired
	private SaludoService saludoService;

	
    @RequestMapping("/saludar/{nombre}")
    public String saludo(@PathVariable(value="nombre") String nombre, Model model) {
        model.addAttribute("mensaje", saludoService.saluda(nombre));
        return "saludo";
    }

    
    @RequestMapping("/despedida/{nombre}")
    public String despedida(@PathVariable(value="nombre") String nombre, Model model) {
        model.addAttribute("mensaje", saludoService.despedir(nombre));
        return "despedida";
    }
	
	
	@GetMapping(path = "/electronica")
	public String electronica() {
		return "index";
	}
	

    
	@GetMapping(path = "/listUsuario")
	public String listAllUsuarios(Model model) {
		List<Usuario> listUsuario = usuarioService.listAllUsuario();
		model.addAttribute("listUsuario", listUsuario);
		return "list";
	}
	
	@RequestMapping("/newUsuario")
	public String newUsuario(Model model) {
		Usuario newUsuario = new Usuario();
		model.addAttribute("newUsuario", newUsuario);
		return "crear";
		
	}
	
	@PostMapping("addUsuario")
	public String addUsuario(@ModelAttribute("newUsuario") Usuario usuario) {
		usuarioService.addUsuario(usuario);
		return "redirect:/hola/listUsuario";
		
	}
	
	@RequestMapping("/editarUsuario/{id}")
	public ModelAndView editUsuario(@PathVariable(name = "id") Long Id) {
	    ModelAndView mav = new ModelAndView("editar");
	    Usuario usuario = usuarioService.findUsuarioById(Id);
	    //mav.addObject("usuario", usuario);
	     
	    return mav;
	}
	
	@RequestMapping("/eliminarUsuario/{id}")
	public String eliminarUsuario(@PathVariable(name = "id") Long Id) {
		usuarioService.removerUsuario(Id);
		return "redirect:/hola/listUsuario";
	}
	
}


