package com.camila.cursobjava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		// armazenar 4 notas de 5 alunos.

		double[][] notasAlunos = new double[5][4];
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9;

		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 7;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 5;
		notasAlunos[2][3] = 6;

		notasAlunos[3][0] = 1;
		notasAlunos[3][1] = 7;
		notasAlunos[3][2] = 6;
		notasAlunos[3][3] = 10;

		notasAlunos[4][0] = 5;
		notasAlunos[4][1] = 7;
		notasAlunos[4][2] = 8;
		notasAlunos[4][3] = 5;

		// imprimindo valor na tela

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i] + " "); - imprimi o lugar na armazenado na
			// memoria.
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
			}
			System.out.println("--");
		}
		System.out.println("Mudando a nota: ");
		System.out.println("--");
		notasAlunos[1][3] = 5;

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
			}
			System.out.println("--");

		}

		// Calculando média de cada aluno.
		System.out.println("Calculando média: ");
		System.out.println("--");

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("A média do aluno " + i + "é: " + (soma / 4));
			System.out.println("--");

		}
	}

}
