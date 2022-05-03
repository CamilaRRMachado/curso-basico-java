package com.camila.cursobjava.aula19;

public class Arrays {

	public static void main(String[] args) {
		// armazenar a temperatura diaria por um ano.

		double[] temperaturas = new double[365];
		temperaturas[0] = 31.5;
		temperaturas[1] = 31.0;
		temperaturas[2] = 30.5;
		temperaturas[3] = 25.5;
		temperaturas[4] = 11.3;
		temperaturas[5] = 28.0;
		temperaturas[6] = 23.9;

		// System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		// System.out.println("O valor da temperatura do dia 2 é: " + temperaturas[1]);
		// System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		// System.out.println("O valor da temperatura do dia 4 é: " + temperaturas[3]);
		// System.out.println("O valor da temperatura do dia 5 é: " + temperaturas[4]);
		// System.out.println("O valor da temperatura do dia 6 é: " + temperaturas[5]);
		// System.out.println("O valor da temperatura do dia 7 é: " + temperaturas[6]);

		System.out.println("O tamanho do Array é:  " + temperaturas.length);
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia" + (i + 1) + " é: " + temperaturas[i]);
		}

		// FOR MELHORADO - da somente o valor, sem indice
		for (double temp : temperaturas) {
			System.out.println(temp);

		}
	}

}
