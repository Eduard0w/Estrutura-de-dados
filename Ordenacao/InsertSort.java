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
		if(x == vetor.length) {
			System.out.println("\n---Insert sort com recursividade:");
			for(int i=0; i<vetor.length; i++) {
				System.out.print(" | "+vetor[i]+" |");
			}
			return;
		}
		
		menor = vetor[x];
		int i=x-1;
//		for(; i>=0; i--) {
//			if(vetor[i] > menor) {
//				vetor[i+1] = vetor[i];
//			}else if (vetor[i] <= menor){
//				break;
//			}
//		}
//		vetor[i+1] = menor;
//		
		//TODO fazer com o loop while();
		while(i>=0 && vetor[i] > menor) {
			vetor[i+1] = vetor[i];
			i--;
		}
		
		vetor[i+1] = menor;
		
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