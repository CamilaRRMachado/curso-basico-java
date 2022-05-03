package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeNove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em Farenheit: ");
		double F = scan.nextDouble();

		double C = (5 * (F - 32) / 9);
		System.out.println("A temperatura em Celcus é: " + C);

	}

}
