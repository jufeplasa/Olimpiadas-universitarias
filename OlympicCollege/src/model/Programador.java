package model;

public class Programador {
	
	//atributos
	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	//relaciones
	private Programador  izq;
	
	private Programador  der;
	
	public Programador(String nombre, String telefono, String direccion, String eMail) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
	
	public int compareTO(Programador aux) {
		return 0;
	}
	
	public Programador getIzq() {
		return izq;
	}

	public void setIzq(Programador izq) {
		this.izq = izq;
	}

	public Programador getDer() {
		return der;
	}

	public void setDer(Programador der) {
		this.der = der;
	}

	public String darNombre() {
		return nombre;
	}
	public String darTelefono() {
		return telefono;
	}
	public String darDireccion() {
		return direccion;
	}
	public String dareMail() {
		return eMail;
	}
	
	public boolean esHoja() {
		return true;
	}
	
	public Programador darMenor(){
		return null;
		
	}
	
	public Programador darMayor(){
		return null;
		
	}
	
	public int darAltura() {
		return 0;
	}

	public int darPeso() {
		return 0;
	}
	
	public void insertar(Programador np) {
		
	}
	
	public Programador buscar(String nombre) {
		return null;
	}
	
	public Programador eliminar (String nombre) {
		return null;
	}
	
	public void inOrder() {
		
	}
}
