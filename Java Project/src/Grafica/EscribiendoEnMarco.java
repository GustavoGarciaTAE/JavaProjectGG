package Grafica;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto () {
		
		setVisible (true);
		
		setSize (600, 450);
		
		setLocation (400, 200);
		
		setTitle ("Primer texto");
		
		Lamina milamina = new Lamina ();
		
		add(milamina);
		
	}
	
}

class Lamina extends JPanel {
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.red);
		
		g.drawString("Estoy aprendiendo Swing", 100, 100);
		
	}
	
}