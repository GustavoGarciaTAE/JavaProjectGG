package Grafica;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {
	
	public MarcoFoco () {
	
	setBounds(950, 200, 300, 480);
	
	setVisible(true);
	
	add(new LaminaFoco());
	
	}
}

class LaminaFoco extends JPanel {
	
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos elfoco = new LanzaFocos();
		
		cuadro1.addFocusListener(elfoco);
		
	}
	
	private class LanzaFocos implements FocusListener { // Clase interna ó Inner Class

		@Override
		public void focusGained(FocusEvent arg0) {
		
		//System.out.println("He ganado el foco");
			
		}

		public void focusLost(FocusEvent arg0) {
			
		String email = cuadro1.getText();
		
		boolean comprobacion = false;
		
		for (int i=0; i<email.length(); i++) {
			
			if (email.charAt(i)=='@') {
				
				comprobacion = true;
				
			}
			
		}
		
		if (comprobacion) {
			
			System.out.println("Correcto");
			
		}else {
			
			System.out.println("incorrecto");
			
		}
			
		}
		
		
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}

