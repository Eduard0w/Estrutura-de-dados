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
		
		int i=0;
		int j=meio+1;
		while(i < tamV1 && j < tamV2) {
			vetE[i] = vetor[i];
			vetD[j] = vetor[j];
			i++;
			j++;
		}
		
		
	}

	public static void main(String[] args) {
		int vetor[] = {2, 3, 4, 1};
		
		mergeSort(vetor, 0, (vetor.length-1));
//		int meio = (vetor.length / 2)-1;
//		int inicio = 0;
//		int fim;
//		
//		for(int i=meio; i>=0; i--) {
//			System.out.print(vetor[i]+" ");
//		}
//		System.out.println();
//		for(int i=meio+1; i<vetor.length; i++) {
//			System.out.print(vetor[i]+" ");
//		}
//		
//		for(int i=meio; i>=0; i--) {
//			for(int j=meio+1; j<vetor.length; j++) {
//				if(vetor[inicio] > vetor[j]) {
//					
//				}
//			}
//		}
//		
//		for(int i=0; i<vetor1.length; i++) {
//			System.out.print(vetor1[i]);
//		}
//		System.out.println();
//		for(int i=0; i<vetor2.length; i++) {
//			System.out.print(vetor2[i]);
//		}
		
		
	}

}
