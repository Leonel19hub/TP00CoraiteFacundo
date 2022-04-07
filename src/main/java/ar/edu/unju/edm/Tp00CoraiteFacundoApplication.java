package ar.edu.unju.edm;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
// import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00CoraiteFacundoApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SpringApplication.run(Tp00CoraiteFacundoApplication.class, args);
		
		/*String nombre = "Facundo";
		System.out.println("Hola "+nombre+" y el "+darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("43536499");
		unEstudiante.setNombre("Facundo");
		
		System.out.println("Estudiante: "+unEstudiante.getNombre()+" \nDNI: "+unEstudiante.getDni());
		
		Calculadora unaCalculadora = new Calculadora();
		unaCalculadora.setN1(100);
		unaCalculadora.setN2(2);
		
		System.out.println("La Suma es: "+unaCalculadora.resolverSuma());
		System.out.println("La Resta es: "+unaCalculadora.resolverResta());
		System.out.println("La Multiplicacion es: "+unaCalculadora.resolverMultiplicacion());
		unaCalculadora.resolverDivision();
		System.out.println("La potencia es: "+unaCalculadora.resolverPotencia());
		unaCalculadora.resolverRaiz();
		*/

		Calculadora unaCalculadora = new Calculadora();
		int n1, n2;
		
		int opcion = 0;
		
		do {
			
			System.out.println("Digite 2 numeros: ");
			n1 = sc.nextInt(); n2 = sc.nextInt();
			unaCalculadora.setN1(n1);
			unaCalculadora.setN2(n2);
			
			System.out.println("--------------MENU-------------");
			System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicacion \n"
					+ " 4. Division \n 5. Potencia \n 6. Raiz \n 7. Salir");
			System.out.println("Elija una opcion: ");
			
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				System.out.println("La Suma es: "+unaCalculadora.resolverSuma()); break;
			case 2: 
				System.out.println("La Resta es: "+unaCalculadora.resolverResta()); break;
			case 3:
				System.out.println("La Multiplicacion es: "+unaCalculadora.resolverMultiplicacion());
				break;
			case 4:
				unaCalculadora.resolverDivision(); break;
			case 5: 
				System.out.println("La potencia es: "+unaCalculadora.resolverPotencia()); break;
			case 6: 
				unaCalculadora.resolverRaiz(); break;
			case 7: System.out.println("NOS VEMOS!"); break;
			default: System.out.println("OPCION INCORRECTA!");
			}
		}while(opcion != 7);
		
		sc.close();

	}
	
	public static  String darNombre() {
		String nuevoNombre = "Rafa";
		return nuevoNombre;
	}
	

}
