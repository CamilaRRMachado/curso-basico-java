// Crie um vetor com 10 elementos
// Escreva um progema que mostre os divisores dentro de cada elemento.

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();

		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analizando o numero " + vetorA[i]);
			for (int j = 1; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " é divisor ");
				}
			}
			System.out.println("--");
		}
	}
}