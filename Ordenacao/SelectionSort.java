package Ordenacao;

public class SelectionSort {

	public static void selectionSort(int[] vetor) {
		for(int i = 0; i<vetor.length-1; i++) {//i=0 ; i < 2
			int menor = i; // menor = 2
			for(int j = i+1; j<vetor.length; j++) {//j=3 ; j < 3
				if(vetor[j] < vetor[menor]) {//2 > 1 ?
					menor = j;
				}
			}
			if(menor != i) {
				int n = vetor[i];
				vetor[i] = vetor[menor];
				vetor[menor] = n;
			}
		}
		
		System.out.println("---Selection sort sem recursividade:");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(" | "+vetor[i]+" |");
		}
	}
	
	public static void selectionSortRe(int[] vetor, int inicio) {
		if(inicio == vetor.length-1) { 
			System.out.println("---Selection sort com recursividade:");
			for(int i=0; i<vetor.length; i++) {
				System.out.print(" | "+vetor[i]+" |");
			}
			return;
		}
		
		int menor = inicio;
		for(int i=inicio+1; i<vetor.length; i++) {
			if(vetor[menor] > vetor[i]) {
				menor = i;
			}
		}
		
		if(menor != inicio) {
			int temp = vetor[inicio];
			vetor[inicio] = vetor[menor];
			vetor[menor] = temp;
		}
		
		selectionSortRe(vetor, inicio+1);
	}
	
	public static void main(String[] args) {
		int[] vetor = {2, 3, 1};
		
//		selectionSort(vetor);
//		System.out.println("\n");
		selectionSortRe(vetor, 0);
	}

}
