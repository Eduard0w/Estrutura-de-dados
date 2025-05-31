package pilha;

import no.No;

public class PilhaEncadeada<T> {
	private No<T> topo; // referencia do topo da pilha, ou seja, seguira o utimo elemento acrescentado.
	
	public boolean isVazio() {
		return this.topo == null;
	}
	
	public void push(T elemento) {
		
		No<T> novoNo = new No<>(elemento);
		novoNo.setProximo(topo);
		topo = novoNo;
	
	}
	
	public void pop() {
		if(isVazio()) {
//			return null;
			return;
		}
//		T elemento = topo.getElemento();
		topo = topo.getProximo(); // move topo para o proximo nó
//		return elemento;
	}
	
	public T peek() {
		if(isVazio()) {
			return null;
		}
		
		return topo.getElemento();
	}
	
	public void print() {
		No<T> atual = topo;
		
		while(atual != null) {
			System.out.println("| "+ atual.getElemento() + " |");
			atual = atual.getProximo();
		}
	}

	public static void main(String[] args) {
		PilhaEncadeada<Integer> pilha = new PilhaEncadeada<Integer>();
		
		System.out.println("---Pilha completa---\n");
		pilha.push(2);
		pilha.push(3);
		pilha.push(10);
		pilha.print();
		System.out.println("\n Ultimo elemento acrescentado "+pilha.peek()+"\n");
		pilha.pop();
		System.out.println("\n---Pilha depois da remoção---\n");
		pilha.print();

	}

}
