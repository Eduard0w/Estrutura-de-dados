package fila;

import no.No;

public class FilaEncadeada<T> {
	private No<T> inicio;
	private No<T> fim;
	private int total;
	
	public boolean isVazio() {
		return inicio == null;		
	}
	
	public int size() {
		return total;
	}
	
	public void enqueue(T elemento) {
		
		No<T> novoNo = new No<>(elemento);
		if(inicio == null) {
			inicio = novoNo;
		}else {
			fim.setProximo(novoNo);
		}
		
		fim = novoNo;
		total++;
	}
	
	public void dequeue() {
		if(isVazio()) {
			return;
		}
		
		inicio = inicio.getProximo();
		total--;
		if(inicio == null) {
			fim = null;
		}
	}
	
	public void print() {
		if(isVazio()) {
			System.out.println("Fila está vazia!");
			return;
		}
		
		No<T> elementos = inicio;
		while(elementos != null) {
			System.out.print(" | "+elementos.getElemento());
			System.out.print(" |");
			elementos = elementos.getProximo();
		}
		System.out.println();
	}
	
	public T peek() {
		if(isVazio()) {
			System.out.println("Fila vazia!");
			return null;
		}

		return inicio.getElemento();
	}

	public static void main(String[] args) {
		FilaEncadeada<Integer> filaE = new FilaEncadeada<Integer>();
		
		filaE.enqueue(1);
		filaE.enqueue(2);
		filaE.enqueue(3);
		System.out.println("---Fila inicial---\n");
		filaE.print();
		System.out.println("\n---Primeiro elemento da fila: "+filaE.peek());
		filaE.dequeue();
		filaE.enqueue(5);
		System.out.println("\n---Pós remoção---\n");
		filaE.print();
		System.out.println("\n---Primeiro elemento da fila: "+filaE.peek());

	}

}
