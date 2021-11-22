package model;

public class Maraton {

	private int numProgramadores;
	

	
	private Programador programadorRaiz;


	public Maraton() {
		
	}
	
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) {
		Programador pn=new Programador (nombre, telefono, direccion, eMail);
		if(programadorRaiz == null){//vacía
		
			programadorRaiz = pn;
		}
		else { //tiene al menos uno
		
			Programador temp = programadorRaiz;
			boolean added = false;
			while( !added ) {
				
				if(pn.compareTo(temp)==-1) {
				
					if( temp.darMenor() == null)
					{
						temp.setIzq(pn);
						added = true;
					}
					else
					{
						temp = temp.darMenor();
					}

				}
				else if(pn.compareTo(temp)==1){
				
					if( temp.darMayor() == null)
					{
						temp.setDer(pn);
						added = true;
					}
					else
					{
						temp = temp.darMayor();
					}
				}
			}
		}
	}
	

	public void eliminarProgramador(String nombre) {
		
	}
	

	public Programador buscarProgramador(String nombre) {
		return null;
	}
	

	public void darListaProgramador() {
	}
	
	public Programador getProgramadorRaiz() {
		return programadorRaiz;
	}

	public void setProgramadorRaiz(Programador programadorRaiz) {
		this.programadorRaiz = programadorRaiz;
	}

	public int getNumProgramadores() {
		return numProgramadores;
	}
	
}
