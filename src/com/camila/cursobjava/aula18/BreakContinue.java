package com.camila.cursobjava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// Exemplos de break e continue.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: ");
		double num = scan.nextDouble();
		System.out.println("Digite o numero limite: ");
		double max = scan.nextDouble();

		for (double i = num; i <= max; i++) {

			if (i % 7 == 0) {
				System.out.println(" O valor de i, sendo i o numero mais proximo á ser dividido por 7 é: " + i);
				break;
			}
		}

		// go-too não é boas praticas
		for (int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1)
							break rotulo1;
						if (i == 2)
							break rotulo2;
						if (i == 3)
							break rotulo3;
						System.out.println("rotulo3");
					}
				}
				System.out.println("rotulo2");
			}
			System.out.println("rotulo1");
			System.out.println("valor de i: " + i);
			System.out.println("Saiu do loop");

		}

		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o numero limite: ");
		double max1 = scan.nextDouble();

		for (double i = num1; i <= max1; i++) {

			if (i % 7 == 0) {
				continue;
			}
			System.out.println(" O valor de i, pulando os divisiveis por 7: " + i);
		}

	}

}
