package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra: ");
		String input = scan.nextLine();

		if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i")
				|| input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")) {
			System.out.println("vogal ");
		} else {
			System.out.println("Consoante");
		}

		if (input.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch (input) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			case "u":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
				break;

			}

		}

	}
}