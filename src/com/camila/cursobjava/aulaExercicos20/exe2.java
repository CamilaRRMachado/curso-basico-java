// Gire e imprima M 10x10 com valor aleatorio entre 0 e 9
// indique o maior e o menor valor da: linha 5 e coluna 7

package com.camila.cursobjava.aulaExercicos20;

import java.util.Random;

public class exe2 {

	public static void main(String[] args) {
		int[][] numAleatorio = new int[10][10];

		Random numRandom = new Random();

		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				numAleatorio[i][j] = numRandom.nextInt(100);
			}
		}

		for (int i = 0; i < numAleatorio.length; i++) {
			for (int j = 0; j < numAleatorio[i].length; j++) {
				System.out.print(numAleatorio[i][j] + "|");
			}
			System.out.println();
		}

		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;
		for (int i = 0; i < numAleatorio[linha5].length; i++) {
			if (numAleatorio[linha5][i] > maiorL5) {
				maiorL5 = numAleatorio[linha5][i];
			}
			if (numAleatorio[linha5][i] < menorL5) {
				menorL5 = numAleatorio[linha5][i];
			}
		}

		System.out.println("O MAIOR valor da linha 5: " + maiorL5);
		System.out.println("O MENOR valor da linha 5: " + menorL5);

		int maiorC7 = 0;
		int menorC7 = 101;
		int coluna7 = 7;
		for (int i = 0; i < numAleatorio.length; i++) {
			if (numAleatorio[i][coluna7] > maiorC7) {
				maiorL5 = numAleatorio[i][coluna7];
			}
			if (numAleatorio[i][coluna7] < menorC7) {
				menorL5 = numAleatorio[i][coluna7];
			}
		}
		System.out.println("O MAIOR valor da coluna 7: " + maiorC7);
		System.out.println("O MENOR valor da coluna 7: " + menorC7);

	}
}
