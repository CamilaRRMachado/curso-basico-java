package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double num = scan.nextDouble();

		if (num >= 0) {
			System.out.println("O numero digitado foi positivo: " + num);
		} else {
			System.out.println("O numero digitado foi negativo" + num);
		}
	}

}
