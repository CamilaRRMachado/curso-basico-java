package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeSete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();

		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro da area do quadrado é: " + (area * 2));

	}

}
