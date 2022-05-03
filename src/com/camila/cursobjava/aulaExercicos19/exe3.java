// Ler vetor A com 20 elementos,
//Criar B para armazenar os elementos pares de A
//Criar C para armazenar os elemtnos impares de A
package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];// pares
		int[] vetorC = new int[vetorA.length];// impares

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();

		}

		int posB = 0;
		int posC = 0;
		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
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
		System.out.println("--");

		System.out.println("Vetor C = ");
		for (int i = 0; i < posC; i++) {
			System.out.println(vetorC[i] + " ");
		}
		System.out.println("--");
	}

}
