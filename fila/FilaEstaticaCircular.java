package fila;

public class FilaEstaticaCircular<T> {
	private T elementos[];
	private int inicio;
	private int fim;
	private int total;
	
	@SuppressWarnings("unchecked")
	public FilaEstaticaCircular(int tamanho) {
		this.elementos = (T[]) new Object[tamanho];
		this.inicio = this.fim = 0;
		this.total = 0;
	}
	
	public boolean isVazio() {
		return total == 0;
	}
	public boolean isCheio() {
		return total == elementos.length;
	}
	
	public void enqueue(T elemento) {
		if(isCheio()) {
			System.out.println("Já esta cheio!\n");
			return;
		}
		
		elementos[fim] = elemento;
		fim = (fim+1) % elementos.length;
		total++;
	}
	
	public void dequeue() {
		if(isVazio()) {
			System.out.println("Fila já está vazia!");
			return;
		}
				
		elementos[inicio] = null;
		inicio = (inicio+1) % elementos.length;
		total--;
	}
	
	public void PrintInicio() {
		if(isVazio()) {
			System.out.println("Fila está vazia!");
			return;
		}
		int ultimo = (fim - 1 + elementos.length) % elementos.length;
		System.out.println("Esse é o primeiro elemento: "+ elementos[inicio]);
		System.out.println("Esse é o ultimo elemento: "+ elementos[ultimo]);
	}
	
	public void print() {
		for(int i = 0; i < total; i++) {
			int index = (inicio + i) % elementos.length;
			System.out.print(" | "+this.elementos[index]);
			System.out.print(" |");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		FilaEstaticaCircular<Integer> filaCircular = new FilaEstaticaCircular<Integer>(4);
		
		filaCircular.enqueue(1);
		filaCircular.enqueue(2);
		filaCircular.enqueue(3);
		System.out.println("---Fila Inicial---\n");
		filaCircular.print();
		filaCircular.dequeue();
		System.out.println("\n---Pós remoção---\n");
		filaCircular.print();
		System.out.println("\n---Pós Enfileiramento---\n");
		filaCircular.enqueue(4);
		filaCircular.enqueue(5);
//		filaCircular.enqueue(6);
		filaCircular.print();
		
	}

}
