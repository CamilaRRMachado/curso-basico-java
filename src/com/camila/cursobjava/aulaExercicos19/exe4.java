//Ler um vetor A com 20 elementos
//armazenar separadamente os impares dos pares no vetor B

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];// pares e impares

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();

		}
		int posB = 0;
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}

		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");

		}

		System.out.println("--");

		System.out.println("Vetor B = ");
		for (int i = 0; i < posB; i++) {
			System.out.println(vetorB[i] + " ");
		}
	}
}
