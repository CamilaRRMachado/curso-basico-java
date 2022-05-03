package com.camila.cursobjava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {

		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro; // simples
		boolean resultado2 = falso && verdadeiro; // curtocircuito
		System.out.println(resultado1);
		System.out.println(resultado2);

		boolean verdadeiro1 = true;
		boolean falso2 = false;
		boolean resultado3 = verdadeiro1 & falso2; // simples
		boolean resultado4 = verdadeiro1 && falso2; // curtocircuito
		System.out.println(resultado3);
		System.out.println(resultado4);

		int resultado5 = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado5);

	}

}
