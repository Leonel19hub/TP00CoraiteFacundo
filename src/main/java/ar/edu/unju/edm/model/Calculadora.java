package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
	private int n1;
	private int n2;
	
	// Constructor
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	// Getters & Setters 
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int resolverSuma() {
		
		return n1+n2;
	}
	public int resolverResta() {
		
		return n1-n2;
	}
	public int resolverMultiplicacion() {
		
		return n1*n2;
	}
	public int resolverDivision() {
		// if(n2 == 0) {
		// 	System.out.println("NO SE DIVIDE POR 0!");
		// }
		// else {
		// 	System.out.println("La Division es: "+n1/n2);
		// }
		return n1/n2;
		//return n1;
		
	}
	
	public int resolverPotencia() {
		return (int) Math.pow(n1, n2);
	
	}
	
	public void resolverRaiz() {
		System.out.println("La raiz cuadrada de: "+n1+" Es "+Math.sqrt(n1));

		System.out.println("La raiz cuadrada de: "+n2+" Es "+Math.sqrt(n2));
	}
}
