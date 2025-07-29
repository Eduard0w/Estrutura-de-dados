package buscas;

import java.util.Arrays;

public class BuscaBinaria {

	public static int buscaBinaria(int vetor[],  int x, int inicio, int fim) {
		if(fim < inicio) {
			return -1;
		}
		int meio = (inicio + fim) / 2;
		if(vetor[meio] == x) {
			return meio;
		}else if(x < vetor[meio]) {
			return buscaBinaria(vetor, x, inicio, (meio - 1)); 
		} else {
			return buscaBinaria(vetor, x, (meio + 1), fim);
		}
		
	}
	

	public static void main(String[] args) {
		int vetor[] = {1, 3, 4, 5, 10, 20, 2, 6, 15};
		int x = 20;
		
		Arrays.sort(vetor);
		int posicao = buscaBinaria(vetor, x, 0, (vetor.length - 1));
		
		if(posicao == -1) {
			System.out.println("Numero não encontrado!");
		}else {
			System.out.println("A posição do número "+ x + " é: "+ posicao);
		}
	}

}