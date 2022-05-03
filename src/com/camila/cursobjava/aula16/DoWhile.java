package com.camila.cursobjava.aula16;

public class DoWhile {

	public static void main(String[] args) {
		// contagem de numero de 0 a 10

		int i = 1; // count ou contador cont
		int max = 10;

		System.out.println("Contando até " + max);

		while (i < max) {
			System.out.println("Valor de i: " + i);
			i++; // i = i + 1

		}

		System.out.println(i);

		do {
			i++;
			System.out.println("Valor de i: " + i);

		} while (i < 15);

		System.out.println(i);
	}

}
