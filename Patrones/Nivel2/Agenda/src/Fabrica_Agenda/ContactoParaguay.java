package Fabrica_Agenda;

import Contacto_Pais.iPais;
import Contacto_Pais.Paraguay;

public class ContactoParaguay implements FabricaAbstracta{

	@Override 
	
	public iPais crearContacto(String nombre, String apellido , String numero){
		return new Paraguay(nombre, apellido, numero);
	}
	
}
