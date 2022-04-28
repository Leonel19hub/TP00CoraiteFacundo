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

	@GetMapping("/calculoResta")
	public String restar(@RequestParam(name="num1") int num1, @RequestParam(name =  "num2") int num2, Model model){
		int resultadoS = 0;
		Calculadora restaCalculadora = new Calculadora();
		restaCalculadora.setN1(num1);
		restaCalculadora.setN2(num2);
		resultadoS = restaCalculadora.resolverResta();
		model.addAttribute("resultadoS", resultadoS);
		return "resultado";
	}

	@GetMapping("/calculoMultiplicacion")
	public String multiplicacion(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
		int resultadoS = 0;
		Calculadora multCalculadora = new Calculadora();
		multCalculadora.setN1(num1);
		multCalculadora.setN2(num2);
		resultadoS = multCalculadora.resolverMultiplicacion();
		model.addAttribute("resultadoS", resultadoS);
		return "resultado";
	}

	@GetMapping("/calculoDivision")
	public String dividir(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2, Model model){
		int resultadoS = 0;
		String mensaje = "";
		Calculadora divCalculadora = new Calculadora();
		divCalculadora.setN1(num1);
		divCalculadora.setN2(num2);

		if(num2 > 0){
			resultadoS = divCalculadora.resolverDivision();
			model.addAttribute("resultadoS", resultadoS);
		}
		else{
			mensaje = "El divisior debe no puede ser 0";
			model.addAttribute("mensaje", mensaje);
		}

		return "resultado";
	}

	@GetMapping("/calculoPotencia")
	public String potencia(@RequestParam(name = "num1")int num1, @RequestParam(name = "num2")int num2, Model model){
		int resultadoS = 0;
		Calculadora potCalculadora = new Calculadora();
		potCalculadora.setN1(num1);
		potCalculadora.setN2(num2);
		resultadoS =  potCalculadora.resolverPotencia();
		model.addAttribute("resultadoS", resultadoS);
		return "resultado";
	}

	@GetMapping("/calculoRaiz")
	public String raiz(@RequestParam(name = "num1")int num1, @RequestParam(name = "num2")int num2, Model model){
		double resultadoS;
		Calculadora raizCalculadora = new Calculadora();
		raizCalculadora.setN1(num1);
		raizCalculadora.setN2(num2);
		resultadoS = raizCalculadora.resolverRaiz();

		model.addAttribute("resultadoS", resultadoS);

		return "resultado";
	}


}
