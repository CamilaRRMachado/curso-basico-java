package com.camila.cursobjava.aulaExercicos14e15;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno: M, V ou N ");
		String turno = scan.next();

		switch (turno) {
		case "M":
			System.out.println("Bom dia! ");
			break;
		case "m":
			System.out.println("Bom dia! ");
			break;
		case "V":
			System.out.println("Boa tarde! ");
			break;
		case "v":
			System.out.println("Boa tarde! ");
			break;
		case "N":
			System.out.println("Boa noite! ");
			break;
		case "n":
			System.out.println("Boa noite! ");
			break;
		default:
			System.out.println("Turno invalido ); ");

		}

	}

}
