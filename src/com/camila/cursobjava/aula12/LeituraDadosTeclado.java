package com.camila.cursobjava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Digite seu nome completo: "); String nomeCompleto =
		 * scan.nextLine(); System.out.println("Seu nome é : " + nomeCompleto);
		 * 
		 * System.out.println("Digite seu primeiro nome: "); String primeiroNome =
		 * scan.next(); System.out.println("Seu primeiro nome é : " + primeiroNome);
		 * 
		 * System.out.println("Digite seu segundo nome: "); String segundoNome =
		 * scan.next(); System.out.println("Seu segundo nome é : " + segundoNome);
		 * 
		 * String terceiroNome = primeiroNome + segundoNome)
		 * System.out.println("Seu nome completo: " + terceiroNome);
		 */

		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem pet:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qdtFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qdtFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem pet?  " + temPet);
	}

}
