//Escreva um programa que guarde dados de uma pesquisa
// a pesquisa consiste em pergutar ao cidad�o
// qt de filhos e nome de cada filho.
// Guarde na memoria de forma que cada pessoa entevistada
// ocupe some o espa�o necess�rio na mem�ria 
// para guardar os nomes dos filhos
// imprima as infoma��es na tela.

package com.camila.cursobjava.aula20;

import java.util.Scanner;

public class ArrayIrregular {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Entre com o n�mero de pessoas entrevistadas: ");
		int numPessoas = scan.nextInt();

		String[][] nomesFilhos = new String[numPessoas][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println(" Entre com a qt de filhos:");
			int qtFilhos = scan.nextInt();

			nomesFilhos[i] = new String[qtFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho:  " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}

		}

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A pessoa: " + i + " tem " + nomesFilhos[i].length + "filho");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("nome: " + nomesFilhos[i][j]);
			}
		}
	}

}
