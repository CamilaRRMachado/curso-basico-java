package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o tercerio numero: ");
		double num3 = scan.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(" Num1 é o maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(" Num2 é o maior: " + num2);
		}
		if (num3 >= num1 && num3 >= num2) {
			System.out.println(" Num3 é o maior: " + num3);
		}

	}
}
