package Fabrica_Agenda;

import Contacto_Pais.Espa�a;
import Contacto_Pais.iPais;

public class ContactoEspa�a implements FabricaAbstracta {

	@Override 
	
	public iPais crearContacto(String nombre, String apellido , String numero){
		return new Espa�a(nombre,apellido,numero);
	}
	
}
