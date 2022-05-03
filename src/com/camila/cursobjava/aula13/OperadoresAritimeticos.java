package com.camila.cursobjava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		// String concatenada
		String primeiroNome = "Esta é";
		String segundoNome = " Uma string concatenada ";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

		resultado = resultado + 1;
		System.out.println(resultado);

		resultado++;
		System.out.println(resultado);

		System.out.println(resultado++); // soma antes 5
		System.out.println(++resultado); // soma depois 7

		resultado--;
		System.out.println(resultado);

		System.out.println(resultado--); // diminui antes
		System.out.println(--resultado); // diminui dps depois

	}

}
