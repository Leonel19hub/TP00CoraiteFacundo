package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00CoraiteFacundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00CoraiteFacundoApplication.class, args);
		
		String nombre = "Facundo";
		System.out.println("Hola "+nombre+" y el "+darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("43536499");
		unEstudiante.setNombre("Facundo");
		
		System.out.println("Estudiante: "+unEstudiante.getNombre()+" \nDNI: "+unEstudiante.getDni());
		
		Calculadora unaCalculadora = new Calculadora();
		unaCalculadora.setN1(36);
		unaCalculadora.setN2(0);
		
		System.out.println("La Suma es: "+unaCalculadora.resolverSuma());
		System.out.println("La Resta es: "+unaCalculadora.resolverResta());
		System.out.println("La Multiplicacion es: "+unaCalculadora.resolverMultiplicacion());
		unaCalculadora.resolverDivision();
		
	}
	
	public static  String darNombre() {
		String nuevoNombre = "Rafa";
		return nuevoNombre;
	}

}
