package taska1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Undo c = Undo.getInstance();
		// Undo d = new Undo(); solo se puede tener una instancia de la clase undo,
		// gracias al patron Singleton
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Elige una opcion");
		System.out.println();
		System.out.println("Opcion : Comando" + "\nOpcion : Undo " + "\nOpcion : Redo " + "\nOpcion Estado "+"\nOpcion  Salir ");
		boolean condicion = false;
		
		while (!condicion) {
			String user = ent.nextLine();

			switch (user.toUpperCase()) {
			case "Palabras" :
				c.palabras();
				break;
			case "UNDO" : 
				c.undo();
			case "REDO" : 
				c.redo();
			case "INFO" :
				c.obtenerEstado();
				break;
			case "SALIR" : 
				c.obtenerEstado();
				System.out.println("Gracias, vuelva pronto");
				condicion = true;
				break;
			default: 
				c.ing(user);
				
			}

		}
	}
}
