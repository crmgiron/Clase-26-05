package clase.sabado;

import java.util.Scanner;

public class Ejemplos {

	public static void main(String[] args) {
		Pilas pi = new Pilas();
		Scanner scan = new Scanner(System.in);
		
		int op = 0;
		int num = 0;
		
		do {
			System.out.println(" ");
			System.out.println("1. INSERTAR DATO");
			System.out.println("2. ELIMINAR DATO");
			System.out.println("4. SALIR");
			System.out.println("INGRESE SU OPCION");
			
			op=scan.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("INGRESE DATO");
				num = scan.nextInt();
				pi.insertar(num);
				break;
			case 2:
				pi.quitar();
				System.out.println("ELIMINA ULTIMO DATO");
				//pi.quitar();
				break;
				
			}
			
		}while(op!=4);
		
		
		/*
		pi.insertar(22);
		pi.insertar(33);
		pi.insertar(44);
		pi.insertar(55);
		pi.insertar(66);
		
		pi.quitar();
		*/

	}

}
