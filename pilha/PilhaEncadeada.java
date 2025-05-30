package pilha;

public class PilhaEncadeada<T> {
	private No<T> topo; // referencia do topo da pilha, ou seja, seguira o utimo elemento acrescentado.
	
	public class No<T> {
		private T elemento;
		private No<T> proximo;
		
		public No (T elemento) {
			this.elemento = elemento;
			this.proximo = null;
		}

		public T getElemento() {
			return elemento;
		}

		public void setElemento(T elemento) {
			this.elemento = elemento;
		}

		public No<T> getProximo() {
			return proximo;
		}

		public void setProximo(No<T> proximo) {
			this.proximo = proximo;
		}
		
	}
	
	public void push(T elemento) {
		
		No<T> novoNo = new No<>(elemento);
		novoNo.setProximo(topo);
		topo = novoNo;
	
	}

	public static void main(String[] args) {
		PilhaEncadeada<Integer> pilha = new PilhaEncadeada<Integer>();
		
		pilha.push(2);
		pilha.push(3);
		pilha.push(10);
		

	}

}
