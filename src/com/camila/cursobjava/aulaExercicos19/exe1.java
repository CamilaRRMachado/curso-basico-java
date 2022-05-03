// Ler um vetor A com 10 elementos e
//contruir um vetor B de mesmo tipo e tamanho 
// com os mesmo elementos de A, sendo estes invertidos.
// Ex: o 1 elemento de A deve ser o ultimo elemento de B
package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();

			vetorB[vetorA.length - i - 1] = vetorA[i];

		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");

		}

		System.out.println("--");

		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		System.out.println("--");

	}
}
