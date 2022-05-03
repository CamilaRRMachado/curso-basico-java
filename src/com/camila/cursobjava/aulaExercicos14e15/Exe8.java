package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o tercerio numero: ");
		double num3 = scan.nextDouble();

		if (num1 <= num2 && num1 <= num3) {
			System.out.println(" Compre o produto 1 por: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println(" Compre o produto 2 por:  " + num2);
		}
		if (num3 <= num1 && num3 <= num2) {
			System.out.println("Compre o produto 3 por: " + num3);
		}

	}

}
