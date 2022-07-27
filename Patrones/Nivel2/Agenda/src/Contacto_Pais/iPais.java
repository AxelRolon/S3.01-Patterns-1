package Contacto_Pais;

public interface iPais {

	void getNombre();

	void getApellido();

	void getNumero();
	
	void getDireccion();
	

	void setNombre(String nombre);

	void setApellido(String apellido);

	void setNumero(String numero);

	void setDireccion (String newCalle , int newNumero , int newCp );
}
