//crie um vetor A com 10 elementos
// crie um programa que verifique se os elementos de A são pares
// se não for, pare o programa

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero para a posição " + i);
			vetorA[i] = scan.nextInt();

			if (vetorA[i] % 2 != 0) {
				break;
			}

		}

	}

}
