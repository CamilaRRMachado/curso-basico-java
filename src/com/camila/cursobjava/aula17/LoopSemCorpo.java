package com.camila.cursobjava.aula17;

public class LoopSemCorpo {

	public static void main(String[] args) {
		// loop sem corpo.

		int soma = 0;
		for (int i = 1; i < 5; soma += i++)
			;
		{
			System.out.println("O valor da soma é: " + soma);

		}

	}
}
