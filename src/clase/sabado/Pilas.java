package clase.sabado;

public class Pilas {
	
	private Nodo cima;
	
	Pilas(){
		cima = null;
	}
	
	public boolean pilaVacia() {
		if(cima==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertar(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	
	public void quitar() {
		
		if(pilaVacia()) {
			System.out.println("LA PILA ESTA VACIA");
			
		}else {
			int aux = cima.dato;
			cima = cima.siguiente;
			System.out.println("EL DATO ELIMINADO ES: "+aux);
		}
	}
	
}
