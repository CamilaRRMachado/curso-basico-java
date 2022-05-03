package com.camila.cursobjava.aulaExercicos16e17;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma nota entre 0 e 10: ");
		double nota = scan.nextDouble();

		if (nota >= 0 && nota <= 10) {
			System.out.println(" Você digitou: " + nota);
		} else {
			System.out.println("Nota inválida");
		}

	}

}
