package buscas;

public class BuscaSequencial {
	
	public static int buscar(int vetor[], int x) {
		int i = 0;
		
		while(vetor[i] < vetor.length) {
			if(vetor[i] == x) {
				return i;
			}
			i++;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int vetor[] = {1, 3, 4, 5, 10, 20, 2, 6};
		int x = 5;
		
		int posicao = buscar(vetor, x);
		
		System.out.println("A posição do numero "+ x + " é: "+ posicao);
	}

}
