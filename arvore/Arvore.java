package arvore;

import java.util.Comparator;

public class Arvore<T> {
	private Comparator<T> compare;
	private Root<T> raiz;
	int i = 1;
//	private Root<T> planta;
	
	public Arvore(Comparator<T> compare) {
		this.compare = compare;
		this.raiz = null;
	}
	
	public void adicionar(T elemento) {
		Root<T> novoElemento = new Root<>(elemento);
		if(raiz == null) {
			raiz = novoElemento;
			System.out.println("Adicionou na ("+(i)+")raiz!");
			return;
		}
		
		Root<T> ponteiro = raiz;
		while(true) {
			int comparacao = compare.compare(elemento, ponteiro.getElemento());
			
			if(comparacao < 0) { // esquerda
				if(ponteiro.getSonL() == null) {
					ponteiro.setSonL(novoElemento);
					System.out.println("Adicionou na ("+(++i)+")esquerda!");
					return;
				}else {
					ponteiro = ponteiro.getSonL(); 
				}
			} else { // direita
				if(ponteiro.getSonR() == null) {
					ponteiro.setSonR(novoElemento);
					System.out.println("Adicionou na ("+(++i)+")direita!");
					return;
				}else {
					ponteiro = ponteiro.getSonR();
				}
			}
		}
	}
	
	public T buscar(T elemento) {
		if(isVazio()) {
			return null;
		}
		Root<T> ponteiro = raiz;
		while(ponteiro != null) {
			int comparacao = compare.compare(elemento, ponteiro.getElemento());

	        if (comparacao == 0) {
	            System.out.println("Encontrado!");
	            return ponteiro.getElemento();
	        } else if (comparacao < 0) {
	            ponteiro = ponteiro.getSonL(); // esquerda
	        } else {
	            ponteiro = ponteiro.getSonR(); // direita
	        }
		}
		
		System.out.println("Não encontrado");
	    return null;
	}
	
	
	public boolean isVazio() {
		return raiz == null; 
	}

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>(Comparator.naturalOrder());
		
		arvore.adicionar(5);
		arvore.adicionar(4);
		arvore.adicionar(6);
		arvore.adicionar(3);
		arvore.adicionar(7);
		
		arvore.buscar(3); 
		
	}

}


//public void adicionar(T elemento) {
//	Root<T> novoElemento = new Root<>(elemento);
//	Root<T> ponteiro = raiz;
//	if(raiz == null) {
//		raiz = novoElemento;
//		System.out.println("Adicionou na ("+(1)+")raiz!");
//	} else if(compare.compare(ponteiro.getElemento(), novoElemento.getElemento()) > 0) {
//		if(ponteiro.getSonL() == null) {
//			ponteiro.setSonL(novoElemento);
//			System.out.println("Adicionou na ("+(i++)+")esquerda!");
//		}else {
//			ponteiro = ponteiro.getSonL(); 
//		}
//	} else {
//		if(ponteiro.getSonR() == null) {
//			ponteiro.setSonR(novoElemento);
//			System.out.println("Adicionou na direita!");
//		}else {
//			ponteiro.getSonR();
//		}
//	}
//}