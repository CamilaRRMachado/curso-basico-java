package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeTres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero inteiro: ");
		int num2 = scan.nextInt();

		int resultado = num1 + num2;
		System.out.println("A soma entre esses numeros inteiros é: " + resultado);

	}

}
