// implementar um programa que obtenha a cotação do dolar em relação ao real
// Armazene em vetor A com 10 elementos de conversões.
// A[i] = cotação do dolar * i, para i variando de 1 ate 20 

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacao;

		System.out.println("entre com a cotação do dolar: ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}
		System.out.println("");

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "");

		}

	}
}
