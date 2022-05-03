// faça um programa que armazene uma matriz de compromissos de uma agenda pessoal
// Cada dia tem 24, onde cada hora pode ser um compromisso.
// O progrma deve exibir um menu 
// o usuario indica o dia do mes que seja alterar e a hora.
// armazenar compromisso do dia/ consultar

package com.camila.cursobjava.aulaExercicos20;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromisso = new String[30][24];

		boolean sair = false;
		byte opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicionar um compromisso.");
			System.out.println("Digite 2 para verificar um compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextByte();
			if (opcao == 1) {// add compromisso.

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println(" Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia < 30) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println(" Entre com uma hora do compromisso: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora invalida, digite novamente.");
					}
				}

				--dia;
				System.out.println("Digite um compromisso: ");
				compromisso[dia][hora] = scan.next();

			} else if (opcao == 2) { // verificar compromisso
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println(" Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia < 30) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente.");
					}
				}

				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println(" Entre com uma hora do compromisso: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora invalida, digite novamente.");
					}
				}
				--dia;
				System.out.println("O compromisso agentado é: ");
				System.out.println(compromisso[dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println(" Opção invalida. Digite novamente.");
			}

		}
	}

}
