// Numero Palindromos =  s�o escritos da direita para esquerda e
// da esquerda da direita mantendo seu valor
//Escreva um programa que verifique se o 1 elementor do vetor � igual ao numero
// e assim por diante, verificando se o numero � palindromo ou n�o

package com.camila.cursobjava.aulaExercicos19;

import java.util.Scanner;

public class exe15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero para a posi��o " + i);
			vetorA[i] = scan.nextInt();

		}
		boolean palindromo = true;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == vetorA[vetorA.length - 1 - i]) {
				palindromo = false;
				break;

			}
		}

	}
}
