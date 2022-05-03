package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite outro numero: ");
		double num2 = scan.nextDouble();

		if (num1 > num2) {
			System.out.println("O primeiro numero digitado foi maior: " + num1);
		} else {
			System.out.println("O segundo numero digitado foi maior: " + num2);
		}
	}
}
