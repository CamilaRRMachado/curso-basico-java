package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o tercerio numero: ");
		double num3 = scan.nextDouble();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3 + " - " + num2 + " - " + num1);
		}

		else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num2 + " - " + num3 + " - " + num1);
		}

		else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3 + " - " + num1 + " - " + num2);
		}

		else if (num2 <= num1 && num2 <= num3 && num3 <= num2) {
			System.out.println(num1 + " - " + num3 + " - " + num1);
		}

		else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num3 + " - " + num1 + " - " + num2);
		}

		else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}
	}

}
