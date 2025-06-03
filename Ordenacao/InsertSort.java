package Ordenacao;

public class InsertSort {

	public static void main(String[] args) {
		int[] vetor = {2, 3, 1};
		
//		insertSort(vetor);
		insertSortRe(vetor, 1, 0);
		
	}
	
	public static void insertSort(int[] vetor) {
		for(int i=1; i<vetor.length; i++) {
			int menor = vetor[i];
			int j=i-1;
				for( ; j>=0; j--) {
					if(vetor[j] > menor) {
						int temp = vetor[j];
						vetor[j+1] = temp;
					}else {
						break;
					}
				}
				vetor[j+1] = menor;
			}
		
		//TODO fazer com while(){}
		
		System.out.println("---Insert sort sem recursividade:");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(" | "+vetor[i]+" |");
		}
	}
	
	public static void insertSortRe(int[] vetor, int x, int menor) {///trocar nome da variavel x
		if(x == vetor.length-1) {
			return;
		}
		
		for(int i=x-1; i>=0; i--) {
			int valor = vetor[i];
			if(vetor[i+1] < valor) {
				menor = valor;
				int temp = vetor[];
			}
		} // TODO terminar de fazer o metodo recursivo
		
		insertSortRe(vetor, x+1, menor);
	}
}

/*
 * [2][3][1]
 *  ^
 * [2][3][1] ^ < | ? 
 *  |  ^
 * [2][3][1] ^ < | ?
 *     |  ^ 
 * [2][3][1] ^ < | ? TRUE
 *  |     ^
 *  
 * [1][2][3]
 *  ^  |
 * */