package Fabrica_Agenda;

import Contacto_Pais.España;
import Contacto_Pais.iPais;

public class ContactoEspaña implements FabricaAbstracta {

	@Override 
	
	public iPais crearContacto(String nombre, String apellido , String numero){
		return new España(nombre,apellido,numero);
	}
	
}
