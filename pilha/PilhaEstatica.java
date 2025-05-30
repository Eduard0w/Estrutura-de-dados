package pilha;

public class PilhaEstatica<T> {
	
		private T elementos[];
		private int topo;
		private int tamanho;
		
		@SuppressWarnings("unchecked")
		public PilhaEstatica(int tamanho) {
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
		
		public boolean push(T elemento) {
			if(isCheio()) {
				return false;
			}
			
			this.elementos[++this.topo] = elemento;
			return true;
		}
	
		public T pop () {
			if(isVazia()) {
				return null;
			}
			
			return this.elementos[this.topo--];
		}
		
		public T peek() {
			if(isVazia()){
				return null;
			}
			
			return this.elementos[this.topo];
		}
		
		public void print() {
			
			for(int i = topo; i>=0; i--) {
				System.out.println("| " + elementos[i] + " |");
			}
		}
		

	public static void main(String[] args) {
		 PilhaEstatica<Integer> pilha = new PilhaEstatica<>(5);
		//caso faça com o newInstance() deve utilizar:
		//PilhaEstatica<Integer> pilha = new PilhaEstatica<>(Integer.class, 10);
		
		 pilha.push(1);
		 pilha.push(3);
		 pilha.push(4);
		 pilha.print();
		 pilha.peek();
		 pilha.pop();
		 System.out.println("\n---depois da remoção---\n");
		 pilha.print();
	}

}
