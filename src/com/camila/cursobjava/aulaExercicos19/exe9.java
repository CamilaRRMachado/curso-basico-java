// Crie um veto A com 11 elementos, indexados de 0 até 10.
// Casa elemento do vetor A é formado pela potencia de base 2
// elevado ao exponte igual a posição so respectivo elemento.
// A[i] = 2  - int A[11]

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[11];
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Math.pow(2, i);

		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "");
		}
		System.out.println("--");
	}

}
