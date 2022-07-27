package Fabrica_Agenda;

import Contacto_Pais.iPais;

public interface FabricaAbstracta {

	public iPais crearContacto(String nombre, String apellido , String numero);
	
}
