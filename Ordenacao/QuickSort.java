package Ordenacao;

public class QuickSort {
	
	public static void quickSort(int vetor[], int inicio, int fim) {
		int pivo = vetor[fim];
		if(pivo <= inicio) {
			return;
		}
		
		for(int i=0; i<vetor.length; i++) {
			if(pivo < vetor[i]) {
				int temp = vetor[inicio];
				vetor[inicio] = vetor[i];
				
			}
		}
	}

	public static void main(String[] args) {
		int vetor[] = {2, 3, 5, 1, 4};
		
	}

}
