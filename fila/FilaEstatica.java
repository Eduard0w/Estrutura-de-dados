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
	
	public void Enqueue(T elemento) {
		this.elementos[++this.fim] = elemento;
		this.inicio = elementos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
