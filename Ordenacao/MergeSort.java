package Ordenacao;

public class MergeSort {
	
	public static void mergeSort(int vetor[], int inicio, int fim) {
		if(inicio >= fim) {
			return;
		}
		int meio = (inicio + fim) / 2;
		
		mergeSort(vetor, inicio, meio);// metade da esquerda.
		mergeSort(vetor, meio+1, fim);// metade da direita.
		merge(vetor, inicio, meio, fim);
		
	}
	
	public static void merge(int vetor[], int inicio, int meio, int fim) {
		int tamV1 = meio - inicio + 1;// tamanho da metade esquerda.
		int tamV2 = fim - meio;// tamanho da metade direita.
		int vetE[] = new int[tamV1];
		int vetD[] = new int[tamV2];
		
		
		//colocando elementos dentro dos novos arrays
		for(int i=0; i<tamV1; i++) {
			vetE[i] = vetor[inicio+i];
		}		
		for(int j=0; j<tamV2; j++) {
			vetD[j] = vetor[meio+1+j];
		}
		
		int i=0;
		int j=0;
		int k = inicio;
		while(i < tamV1 && j < tamV2) {
			if(vetE[i] <= vetD[j]) {
				vetor[k] = vetE[i];
				i++;
			}else {
				vetor[k] = vetD[j];
				j++;
			}
			k++;
		}
		
		while(i < tamV1) {
			vetor[k] = vetE[i];
			i++;
			k++;
		}
		while(j < tamV2) {
			vetor[k] = vetD[j];
			j++;
			k++;
		}
		
		
	}

	public static void main(String[] args) {
		int vetor[] = {2, 3, 4, 1};
		
		mergeSort(vetor, 0, vetor.length-1);
		
		System.out.println("---Merge sort---");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.print("| "+vetor[i] + " |");
		}

}
}
