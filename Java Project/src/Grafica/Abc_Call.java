package Grafica;

import java.util.Scanner;

public class Abc_Call {

	int pri;
	
	public static void main(String[] args) {
		
		new Abc_Call();

	}
	

	public Abc_Call() {
		
		Scanner teso = new Scanner(System.in); 
			
		System.out.println("Que muestra");
		
		String text = teso.nextLine();
		
		recibeN(text);
		
		
	}
	
	public void recibeN(String hola) {
		
		pri = pri + 5;
		
		System.out.println(pri + " " + hola);
		
	}

}
