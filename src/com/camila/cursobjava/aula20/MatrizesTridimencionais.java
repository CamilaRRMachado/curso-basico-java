// Crie uma matriz 3x3x3 onde cada elemento da matriz
//seja igua a soma dos seus indices
// ex: M[1,2,1] = 1+2+1=4
// Obter: somas de todos elementos,
//somas dos pares, soma dos impares
// Imprimir valores

package com.camila.cursobjava.aula20;

public class MatrizesTridimencionais {

	public static void main(String[] args) {
		int[][][] matrizTri = new int[3][3][3];

		for (int i = 0; i < matrizTri.length; i++) {
			for (int j = 0; j < matrizTri[i].length; j++) {
				for (int k = 0; k < matrizTri[i][j].length; k++) {
					System.out.println("I= " + i + "|J= " + j + "|K= " + k);
					matrizTri[i][j][k] = i + j + k;
				}
			}

		}

		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 0; i < matrizTri.length; i++) {
			for (int j = 0; j < matrizTri[i].length; j++) {
				for (int k = 0; k < matrizTri[i][j].length; k++) {
					soma += matrizTri[i][j][k];
					if (matrizTri[i][j][k] % 2 == 0) {
						somaPares += matrizTri[i][j][k];
					} else {
						somaImpares += matrizTri[i][j][k];
					}
				}
			}

		}
		System.out.println("Soma  total= " + soma);
		System.out.println("Soma pares= " + somaPares);
		System.out.println("Soma impares= " + somaImpares);
	}

}
