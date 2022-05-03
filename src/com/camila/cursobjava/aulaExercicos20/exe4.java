// faça um programa que armazene uma matriz de compromissos de uma agenda pessoal
// Cada dia tem 8h, onde cada hora pode ser um compromisso.
// O progrma deve exibir um menu 
// o usuario indica o dia, mes e ano.
// armazenar compromisso, consultar

package com.camila.cursobjava.aulaExercicos20;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromisso = new String[12][30][8];

		boolean sair = false;
		byte opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicionar um compromisso.");
			System.out.println("Digite 2 para verificar um compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextByte();
			if (opcao == 1) {// add compromisso.

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println(" Entre com o mês: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês invalido, digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println(" Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 30) {
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
					if (hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Hora invalida, digite novamente.");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite um compromisso: ");
				compromisso[mes][dia][hora] = scan.next();

			} else if (opcao == 2) { // verificar compromisso

				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println(" Entre com o mês: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês invalido, digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println(" Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 30) {
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

				mes--;
				dia--;
				System.out.println("O compromisso agentado é: ");
				System.out.println(compromisso[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println(" Opção invalida. Digite novamente.");
			}

		}
	}

}
