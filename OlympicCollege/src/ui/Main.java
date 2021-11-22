package ui;

import java.util.Scanner;

import model.Maraton;

public class Main {
	private static Scanner sc;
	private static Maraton maraton;
	
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			int selectIt=showMenu();
			switch(selectIt) {
			
			case 1:
				System.out.println("Ingrese el nombre del programador:");
				String nombre=sc.next();
				System.out.println("Ingrese el numero del programador:");
				String telefono=sc.next();
				System.out.println("Ingrese la direccion del programador:");
				String direccion=sc.next();
				System.out.println("Ingrese el correo del programador:");
				String email=sc.next();
				maraton.agregarProgramador(nombre, telefono, direccion, email);
				break;
				
			case 2:
				
				break;
				
			case 3:
				System.out.println("Saliste del programa.");
				exit=true;
				break;
				
			}
		}
	}
	
	public static int showMenu() {
		int option=0;
		System.out.println("Elige una opcion:");
		System.out.println("1: Agregar un programador ");
		System.out.println("2: Mostrar programadores ordenados (alfabeticamente) ");
		System.out.println("3: Salir ");
		option=sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	
}
