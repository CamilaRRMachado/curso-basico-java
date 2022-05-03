package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeDoze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a altura: ");
		double altura = scan.nextDouble();

		double peso = (72.7 * altura) - 58;

		System.out.println("Para altura infomada o peso ideal é de: " + peso);

	}

}
