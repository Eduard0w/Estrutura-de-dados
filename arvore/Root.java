package arvore;

public class Root<T> {
	private T elemento;
	private Root<T> sonR;
	private Root<T> sonL;
	
	public Root(T elemento) {
		this.elemento = elemento;
		sonR = null;
		sonL = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Root<T> getSonR() {
		return sonR;
	}

	public void setSonR(Root<T> sonR) {
		this.sonR = sonR;
	}

	public Root<T> getSonL() {
		return sonL;
	}

	public void setSonL(Root<T> sonL) {
		this.sonL = sonL;
	}
	
}
