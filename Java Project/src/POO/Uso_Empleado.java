package POO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) { // Metodo Main
		
		/*
		Empleado empleado1 = new Empleado("Julian May", 584000, 1990, 12, 17); // Instancia ó objetos
		Empleado empleado2 = new Empleado("Marcela Rivera", 954200, 2002, 06, 02); // Instancia ó objetos
		Empleado empleado3 = new Empleado("Maria Martin", 751124, 2005, 3, 2); // Instancia ó objetos
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.damenombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta: " + empleado1.dameFecha());
		System.out.println("Nombre: " + empleado2.damenombre() + " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta: " + empleado2.dameFecha());
		System.out.println("Nombre: " + empleado3.damenombre() + " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta: " + empleado3.dameFecha());
		 */
		
		Jefatura jefe_RRHH = new Jefatura("Gustavo", 55000, 2008, 9, 21); 
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] empleadoC = new Empleado [6]; // Empleado es un objeto en este array
		
		empleadoC[0] = new Empleado ("Julian May", 584000, 1990, 12, 17);
		
		empleadoC[1] = new Empleado ("Marcela Rivera", 954200, 2002, 06, 02);
		
		empleadoC[2] = new Empleado ("Maria Martin", 751124, 2005, 03, 02);
		
		empleadoC[3] = new Empleado ("Carmenza"); // Sobre carga de contructor
		
		empleadoC[4] = jefe_RRHH; // Polimorfismo en accion, principio de sustitución
		
		empleadoC[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas = (Jefatura) empleadoC[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		/*
		  for (int g=0; g<3; g++) {
		 
			
			empleadoC[g].subeSueldo(5);
		}
		*/
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.damenombre() + " tiene un bonus de: " + 
		jefa_Finanzas.establece_bonus(500));
		
		System.out.println(empleadoC[3].damenombre() + " TIENE UN BONUS DE: " + empleadoC[3].establece_bonus(200));
		
		for (Empleado g: empleadoC) {
			
			g.subeSueldo(5);
			
		}
		
		Arrays.sort(empleadoC);
		
		/*
		for (int g=0; g<3; g++) {
			
			System.out.println( "Nombre: " + empleadoC[g].damenombre() + 
								" sueldo: " + empleadoC[g].dameSueldo() +
								" Fecha de ingreso: " + empleadoC[g].dameFecha());
		}
		*/
		
		for (Empleado g: empleadoC) {
			
			System.out.println( "Nombre: " + g.damenombre() + 
					" sueldo: " + g.dameSueldo() +
					" Fecha de ingreso: " + g.dameFecha());
		}
		
	}

}

class Empleado implements Comparable, Trabajadores{ 
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) { // Metodo constructor
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);		
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		
		Id = IdSiguiente;
	}
	
	public double establece_bonus (double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
		
	}
	
	public Empleado (String nom) { // Metodo constructor
		
		this (nom, 350000, 1999, 8, 02); // llamada al otro metodo contructor que coincida con el input
		
	}
	
	public String damenombre () { // GETTER
		
		return nombre;
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
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			
			return -1;
			
		}
		
		if (this.sueldo > otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

	class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);	
		
	}
	
	public String tomar_decisiones (String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public double establece_bonus (double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	public void estableceIncentivo (double b) {
		
		incentivo = b;
		
	}
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
}