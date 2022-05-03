// Crie um vetor com 5 elemetos, 
// Crie um programa que imprima a tabuada de cada um dos elementos

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A: " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Tabuade de  " + vetorA[i]);

			for (int j = 0; j <= 10; j++) {
				System.out.println(j + " x " + vetorA[i] + " = " + (vetorA[i] * j));

			}

			System.out.println("--");
		}

	}

}
