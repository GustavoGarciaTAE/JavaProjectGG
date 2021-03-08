package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona [2];

		lasPersonas[0] = new Empleado2 ("Luis Conde", 51000, 2009, 02, 25);
		
		lasPersonas[1] = new alumno ("Ana Lopez", "Ingenieria"); 
		
		for (Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre() + " , " + p.dameDescripcion());
			
		}
	}
}
abstract class Persona {

	public Persona (String nom) {
		
		nombre = nom;
		
	}
	
	public String dameNombre () {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion ();
	
	private String nombre;
	
}

class Empleado2 extends Persona{ 
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) { // Metodo constructor
		
		super (nom); // invoca el constructor de la superclase
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);		
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		
		Id = IdSiguiente;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un ID = " + Id + " con el sueldo= " + sueldo;
	}
	
	public double dameSueldo () { // GETTER
		
		return sueldo;
	}
	
	public Date dameFecha () { // GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo (double porcentaje) { //SETTER
		
		double aumento = sueldo * porcentaje / 100;
		
		sueldo += aumento; // Es lo mismo que:  sueldo = sueldo + aumento;
	}
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

class alumno extends Persona {
	
	public alumno (String nom, String car) {
		
		super(nom);
		
		carrera = car;
		
	}
	
	public String dameDescripcion () {
		
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
	
}
