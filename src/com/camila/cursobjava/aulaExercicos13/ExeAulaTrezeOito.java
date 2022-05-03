package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeOito {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com o quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();

		double salario = valorHora * horas;
		System.out.println("O salario referente a esse mês é: " + salario);

	}

}
