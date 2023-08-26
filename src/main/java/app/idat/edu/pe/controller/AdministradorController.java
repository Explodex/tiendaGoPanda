package app.idat.edu.pe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.idat.edu.pe.model.Producto;
import app.idat.edu.pe.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("")
	public String home(Model model) {
		
		List<Producto> productos =productoService.findAll();
		model.addAttribute("productos", productos);
		
		return "administrador/home";
	}

}
