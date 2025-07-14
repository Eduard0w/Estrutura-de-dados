package Ordenacao;

import java.util.Scanner;

public class QuickSort {
	//método de resolusão: Lomuto partition
	public static int partition(int vetor[], int inicio, int fim) {		
		int pivo = vetor[fim];
		
		int i = inicio - 1;
		
		for(int j = inicio; j <= fim; j++) {
			if(vetor[j] < pivo) {
				i++;
				swap(vetor, i, j);
			}
		}
		
		
		swap(vetor, i+1, fim);
		return i+1;
	}
	
	
	public static void swap(int[] value, int i, int j) {
		int temp = value[i];
	    value[i] = value[j];
	    value[j] = temp;
	}
	
	
	public static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			
			 int pi = partition(vetor, inicio, fim);
			 
			 quickSort(vetor, inicio, pi - 1);
			 quickSort(vetor, pi + 1, fim);
		}
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int vetor[] = {2, 4, 5, 1, 3};
		
		quickSort(vetor, 0, vetor.length - 1);
		
		System.out.println("Vetor organizado: ");
		for(int i=0; i< vetor.length; i++) {
			System.out.print(vetor[i] +", ");
		}
	}

}
