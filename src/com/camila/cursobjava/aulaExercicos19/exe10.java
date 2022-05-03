//Crie um vetor A com 15 elementos inteiros.
//Crie um vetor B de mesmo tamanho.
//Sendo B o fatorial do elemento correspondendo em A

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = 1;
			for (int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");

		}

		System.out.println("--");

		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorB[i] + " ");
		}

	}
}
