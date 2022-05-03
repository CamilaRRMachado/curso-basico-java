package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite com uma letra F ou M: ");
		String input = scan.nextLine();

		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino ");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino ");
		} else {
			System.out.println("Sexo invalido");
		}

	}

}
