package taska1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Undo {
	private static Scanner ent = new Scanner(System.in);
	private static Undo instancia;
	private String actual;
	private String tmp;
	private Stack<String> undo;
	private Stack<String> redo;

	private Undo() {
		redo = new Stack<>();
		undo = new Stack<>();
	}

	public static Undo getInstance() {
		if (instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}

	public void palabras() {
		String user;
		do {
			System.out.println("Ingresa palabras guapetona");
			
			user= ent.nextLine();

		} while (!redo.isEmpty());
			
			undo.push(user);
			actual = user;
	}
	
	public void redo() {
		String user;
		String p;
		if(!undo.isEmpty()) {
			p = undo.peek();
			redo.push(p);	
		}else {
			System.out.println("No se puede ejecutar el comando Redo");
		}

	}
	
	public void undo() {
		String user; 
		if(!undo.isEmpty()) {
			user = undo.pop();
			redo.push(user);
			getActual();
			
			System.out.println("Deshaser :"+ user + "\nActual  :"+ actual);
		}
		
	}
	 public void ing (String s) {
	        if (!redo.isEmpty()){
	            redo = new Stack<>();
	        }
	        undo.push(s);
	        actual = s; }
	        

	public void obtenerEstado() {

		System.out.println("Comandos actuales : " + actual);
		System.out.println("-----------AXLAPP--------------");
		System.out.println("Pila actual Undo/Deshaser : " + undo);
		System.out.println("-----------AXLAPP--------------");
		System.out.println("Pila actual Redo/Rehacer : " + redo);
		System.out.println("-----------AXLAPP--------------");
	}
	 public void getActual () {
	        try{
	            actual = undo.peek();
	        }catch (Exception e) {
	            actual = null;
	        }
	    }
}
