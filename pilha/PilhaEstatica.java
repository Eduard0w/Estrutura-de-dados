package pilha;

public class PilhaEstatica<T> {
	
	class Pilha<T> {
		private T elementos[];
		private int topo;
		private int tamanho;
		
		@SuppressWarnings("unchecked")
		public Pilha(int tamanho) {
			this.tamanho = tamanho;
			this.topo = -1;
			this.elementos = (T[]) new Object[tamanho];
			//tem outra forma de fazer e é essa:
			// this.elemento = (T[]) Array.newInstance(Class<?> componentType, tamanho)
		}
	
		public boolean isCheio() {
			return (this.topo+1 == this.tamanho);
		}
		public boolean isVazia() {
			return (this.topo == -1);
		}
		public int quantidade() {
			return this.topo + 1;
		}
		
		//inserção
		public boolean push(T elemento) {
			if(isCheio()) {
				return false;
			}
			
			this.elementos[this.topo++] = elemento;
			return true;
		}
		
		//remoção
		public T pop () {
			if(isVazia()) {
				return null;
			}
			
			return this.elementos[this.topo--];
		}
		
		//pegar elemento (Read?)
		public T peek() {
			if(isVazia()){
				return null;
			}
			
			return this.elementos[this.topo];
		}
	}
	

	public static void main(String[] args) {
		PilhaEstatica<Integer> pilha = new PilhaEstatica<>();
		//caso faça com o newInstance() deve utilizar:
		//PilhaEstatica<Integer> pilha = new PilhaEstatica<>(Integer.class, 10);
	}

}
