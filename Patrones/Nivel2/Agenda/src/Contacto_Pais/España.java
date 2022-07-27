package Contacto_Pais;

public class España implements iPais {
	final private char prefijo = +34;
	final private int maxDigitos = 9;
	final private int cpmaxDigitos = 4;

	String nombreP;
	String apellidoP;
	String calle;
	String numeroP;
	int numeroCalle, cp;
	

	public España(String nombre, String apellido, String numero) {
		this.nombreP = nombre;
		this.apellidoP = apellido;
		this.numeroP = numero;
	};

	@Override
	public void setNombre(String nombre) {

		nombre = nombreP;

	}

	@Override

	public void getNombre() {
		System.out.println("Nombre : " + nombreP);
	}

	@Override
	public void setApellido(String apellido) {
		apellido = apellidoP;
	}

	public void getApellido() {
		System.out.println("Apellido : " + apellidoP);

	}

	@Override
	public void setNumero(String numero) {
		if (numero.length() == maxDigitos) {

			numeroP = numero;

		} else {
			System.out.println("Numero incorrecto, ingrese un contacto numerico de 9 digitos");
		}
	}

	@Override
	public void getNumero() {
		System.out.println("Numero  telefonico : " + (prefijo + numeroP));
	}

	@Override
	public void setDireccion(String newCalle, int newNumero, int newCp) {
		this.calle = newCalle;
		this.numeroCalle = newNumero;
		while (newCp != cpmaxDigitos) {
			System.out.println("El numero maximo de digitos de codigo postal es 4, ingrese de vuelta");
		}
		this.cp = newCp;
	};

	@Override
	public void getDireccion() {
		System.out.println("Calle :" + calle + "\t Numero :" + numeroCalle + "\t Codigo postal " + cp);

	}
}
