import java.util.ArrayList;

import Contacto_Pais.iPais;
import Fabrica_Agenda.ContactoEspaña;
import Fabrica_Agenda.ContactoParaguay;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<iPais> contacto = new ArrayList<>();
		
		contacto.add(new ContactoEspaña().crearContacto("Tony","Moriz","678545656"));
		contacto.add(new ContactoParaguay().crearContacto("Belen", "Sotto", "0981495488"));
	}

}
