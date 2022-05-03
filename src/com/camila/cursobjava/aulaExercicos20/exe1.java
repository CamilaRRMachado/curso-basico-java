// Gire e imprima M 4x4 com valor aleatorio entre 0 e 9
// determine o maior numero da matriz e a sua posição ( linha e coluna).

package com.camila.cursobjava.aulaExercicos20;

import java.util.Random;

public class exe1 {

	public static void main(String[] args) {

		int[][] numAleatorio = new int[4][4];

		Random numRandom = new Random();

		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				numAleatorio[i][j] = numRandom.nextInt(100);
			}
		}
		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				if (numAleatorio[i][j] > maior) {
					maior = numAleatorio[i][j];
					linha = i;
					coluna = j;
				}

			}
		}
		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				System.out.print(numAleatorio[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);

	}

}
