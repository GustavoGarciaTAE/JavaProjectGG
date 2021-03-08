package POO;

import javax.swing.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
	
		Reloj mireloj = new Reloj ();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

		System.exit(0); // Cuando recibe el Ok de la linea anterior el programa de detiene
		
	}

}

class Reloj {

	public static void enMarcha(int intervalo, boolean sonido) {
		
		class DameLaHora2 implements ActionListener {
			
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("La hora cada 3 segundos " + ahora);
				
				if (sonido) { // Esto es igual que tener sonido == true
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		ActionListener oyente = new DameLaHora2(); // DameLaHora2 oyente = new DameLaHora2();
		
		Timer mitemporizador = new Timer (intervalo, oyente);
		
		mitemporizador.start();
		
	}
	
}