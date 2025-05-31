package fila;

public class FilaEstatica<T>{
	private T elementos[];
	private int inicio;
	private int fim;
	private int tamanho;
	
	@SuppressWarnings("unchecked")
	public FilaEstatica(int tamanho) {
		this.elementos = (T[]) new Object[tamanho];
		this.inicio = this.fim = 0;
		this.tamanho = tamanho;
	}
	
	public boolean isVazio() {
		return this.elementos[this.inicio] == null;
	}
	
	public void Enqueue(T elemento) {
		this.elementos[this.fim] = elemento;
		this.fim++;
	}
	
	public void Dequeue() {
		if(isVazio()) {
			return;
		}
		
//		T elemento = elementos[this.inicio];
		for(int i = this.inicio; i < this.fim-1; i++) {
			elementos[i] = elementos[i+1];
		}
		
		this.elementos[this.fim-1] = null;
		this.fim--;
	}
	
//	public void PrintInicio() {
//		System.out.println("Esse é o primeiro elemento: "+ elementos[inicio]);
//		System.out.println("Esse é o ultimo elemento: "+ elementos[fim-1]);
//	}
	
	public void print() {
		for(int i = this.inicio; i < this.fim; i++) {
			System.out.print(" | "+this.elementos[i]);
			System.out.print(" |");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		FilaEstatica<Integer> fila = new FilaEstatica<>(4);
		
		fila.Enqueue(1);
		fila.Enqueue(2);
		fila.Enqueue(3);
		System.out.println("---Fila---\n");
		fila.print();
		fila.Dequeue();
		System.out.println("\n---Fila pós remoção---\n");
		fila.print();
		fila.Enqueue(4);
		System.out.println("\n---Fila pós enfileiramento---\n");
		fila.print();
//		fila.PrintInicio();
	}

}
