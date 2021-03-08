import java.util.*;


public class String_In_Out {

	public static void main(String[] args) {
		
		Scanner entradas = new Scanner(System.in); // Variable tipo objeto
		
		System.out.println("Ingrese su numbre: ");
		
		String nombre = entradas.nextLine();
		
		System.out.println("Ingrese su edad: ");
		
		int edad = entradas.nextInt();
		
		System.out.println("Hola " + nombre + "! el proximo año tendras " + (edad+1) + " años.");

	}

}
