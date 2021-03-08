package POO;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados ("Paco"); //El primer Empleados hace referencia a la clase y el new Empleados al metodo

		Empleados trabajador2 = new Empleados ("Natalia");
		
		Empleados trabajador3 = new Empleados ("Cami");
		
		Empleados trabajador4 = new Empleados ("Lorena");
		
		trabajador1.CambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() +
							"\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados { // Metodo constructor

	public Empleados (String nom) {
		
		nombre = nom;
		
		seccion = "Administración";

		Id = IdSiguiente;
		
		IdSiguiente++;
	}

	public void CambiaSeccion (String seccion) { // SETTER
		
		this.seccion = seccion;
	}
	
	public String devuelveDatos () { // GETTER
		
		return "El nombre es: " + nombre + ", la seccion es: " + seccion + " y el ID: " + Id;
	}
	  
	public static String dameIdSiguiente () {
		
		return "El IdSiguiente es: " + IdSiguiente;
		
	}
	
	private final String nombre;
	
	private String seccion;
	
	public int Id;
	
	private static int IdSiguiente = 1;
}