import java.util.*;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {

		int figura = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo"));
		
		/*
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Elige una opción: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura = entrada.nextInt();
		*/
		
		switch (figura){
		case 1:
		    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado"));
		    
		    System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
		    
			break;
			
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
			
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base:"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura:"));
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la radio:"));
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
			break;
			
	default:
		    System.out.print("La opcion no es correcta");
		}
	}

}
