package ar.edu.unju.fi.controller;
//Clase encargada de tomar la peticion y controlar que respuesta debe ser presentada en Index
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

@Controller
public class MainController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	//Asocia la url en este caso seria http://localhost:8080/home
	@RequestMapping("/home")
	public String main(Model model) {
		model.addAttribute("usuario", usuarioService.mostrar().getNombre());
	
		return "Index";
	}

}
