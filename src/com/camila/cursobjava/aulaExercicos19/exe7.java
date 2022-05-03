//Crie um vetor com 10 elementos.
// Crie um programa que pegue somento os pares.

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();

		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analizando o numero" + vetorA[i]);
			for (int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " é par");
				}
			}
			System.out.println("--");
		}
	}
}
