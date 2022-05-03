// Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1
//Exe: A[i] = (int)Math.round(Math.round() * 1)
//Implemente um programa que determine o percenturar de 0 e 1 existentes em A

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int qdt0 = 0;
		int qdt1 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
			if (vetorA[i] == 0) {
				qdt0++;
			} else {
				qdt1++;
			}
		}

		// porcentagem:
		// 10 - 100%
		// qdt - x
		// x = (qdt * 100) / 10;

		double porc0 = (qdt0 * 100) / vetorA.length;
		double porc1 = (qdt1 * 100) / vetorA.length;

		System.out.println("");

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "");

		}
		System.out.println("");
		System.out.println(" Porcentagem de 0's: " + porc0);
		System.out.println(" Porcentagem de 1's: " + porc1);

	}
}
