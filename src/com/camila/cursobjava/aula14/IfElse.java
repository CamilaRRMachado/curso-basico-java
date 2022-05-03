package com.camila.cursobjava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");

		} else {
			System.out.println("Voc� n�o � maior de idade");

		}

		// barato <= 10
		// 10 < valor < 15 - pedir desconto
		// 15 <= valor 17 - pesquisar mais.
		// >= 17 muito caro.

		System.out.println("Digite o valor do produto: ");
		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Produto com bom pre�o. ");
		} else if (valor < 10 && valor < 15) {
			System.out.println("Pedir desconto. ");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquise em outra loja. ");
		} else {
			System.out.println("Produto muito caro. Procure outro.");
		}

	}
}
