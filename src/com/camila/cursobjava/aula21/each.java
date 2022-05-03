package com.camila.cursobjava.aula21;

import java.util.Random;

public class each {

	public static void main(String[] args) {

		int[] notas = new int[10];
		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println(" Usando o for each : ");

		for (int nota : notas) {
			System.out.println(nota);
		}

		// exemplo 2
		System.out.println("Exemplo do for each com arrays multidimensionais");
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

		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");

			}
			System.out.println();

		}

	}

}
