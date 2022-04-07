package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.;

@Controller
public class CalculadoraController {
	
	@GetMapping("/menu")
	public String obtenerMenu() {
		return ("index");
	}
	
}
