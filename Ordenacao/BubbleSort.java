package Ordenacao;

public class BubbleSort<T> {
	

	public static void main(String[] args) {
		int[] vetor = {2, 3, 1};
		
//		bubbleSort(vetor);
//		System.out.println("\n");
		bubbleSortRe(vetor, vetor.length);
	}

	
	public static void bubbleSort(int vetor[]) {
		for(int i=0; i<vetor.length-1; i++) {//i=0 ; i < 2
			for(int j=0; j<vetor.length-i-1; j++) {//j=0 ; j < 2
				if(vetor[j] > vetor[j+1]) {//2 > 3 ?
					int n = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = n;
				}
			}
		}
		
		System.out.println("---Bubble sort sem recursividade:");
		for(int k = 0; k<vetor.length; k++) {
			System.out.print(" | "+vetor[k]+" |");
		}
	}
	
	//--------
	
	public static void bubbleSortRe(int vetor[], int tamanho) {
		if (tamanho == 1) {
			System.out.println("---Bubble sort com recursividade:");
			for(int k=0; k < vetor.length; k++) {
				System.out.print(" | "+vetor[k]+" |");
			}
			return;
		}
		
		for(int i=0; i<tamanho-1; i++) {//i=0 ; i < 2
				if(vetor[i] > vetor[i+1]) {//2 > 3 ?
					int n = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = n;
			}
		}
		
		bubbleSortRe(vetor, tamanho-1);
	}
}
