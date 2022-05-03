package com.camila.cursobjava.aulaExercicos13;

import java.util.Scanner;

public class ExeAulaTrezeTreze {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com o quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("O salario bruto referente a esse mês é: " + salarioBruto);
		System.out.println(" O valor de inss é: " + inss);
		System.out.println("O valor do sindicato é:  " + sindicato);
		System.out.println(" O valor do IR:  " + ir);
		System.out.println("O valor do salario liquido é:  " + salarioLiquido);

	}

}
