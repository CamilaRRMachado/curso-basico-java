//Crie um vetor com 10 elementos inteiros.
// Escreva um programa que imprima se o elemento é primo ou não.

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();
		}
		boolean primo;
		String msg;
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}

			msg = "";
			if (primo) {
				msg = " primo!";
			} else {
				msg = " não é primo!";
			}

			System.out.println(vetorA[i] + msg);

		}

	}
}
