package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraController {
	@GetMapping("/menu")
	public String obtenerMenu() {
		return "index";
	}
	
	@GetMapping("/calculoSuma")
	public String suma(@RequestParam (name = "num1") int num1, @RequestParam (name = "num2") int num2, Model model){
		int resultadoS = 0;
		Calculadora nuevaCalculaora = new Calculadora();
		nuevaCalculaora.setN1(num1);
		nuevaCalculaora.setN2(num2);
		resultadoS = nuevaCalculaora.resolverSuma();
		model.addAttribute("resultadoS", resultadoS);
		return "resultado";
	}
}
