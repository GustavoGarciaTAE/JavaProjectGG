import java.util.*;

public class Evalua_edad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese su edad");
		
		int edad = entrada.nextInt();
		
		/*
		if(edad>=18) {
			System.out.println("Usted es mayor de edad");			
		}
		else{
			System.out.println("Usted es menor de edad"); 
		}
		*/
		
		if (edad < 18) {
			System.out.println("Eres adolecente");
		}
		else if (edad < 40 ) {
			System.out.println("Eres joven");
		}
		else if (edad < 65) {
			System.out.println("Eres adulto");
		}
		else {
			System.out.println("Buena el anciano");
		}
	}

}
