package Grafica;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones mimarco = new MarcoBotones();
		
		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame {
	
	public MarcoBotones () {
		
		setTitle("Botones y eventos");
		
		setBounds(200, 200, 500, 300);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);

	}
	
}

class LaminaBotones extends JPanel{
	
	JButton botonAzul = new JButton("Azul");
	
	JButton botonAmarillo = new JButton("Amarillo");
	
	JButton botonRojo = new JButton("Rojo");

	public LaminaBotones() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		
		ColorFondo Azul = new ColorFondo(Color.blue);
		
		ColorFondo Rojo = new ColorFondo(Color.red);
		
		botonAzul.addActionListener(Azul);
		
		botonAmarillo.addActionListener(Amarillo);
		
		botonRojo.addActionListener(Rojo);
	}
	
	private class ColorFondo implements ActionListener { // Oyente
		
		public ColorFondo (Color c) {
			
			ColorFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground (ColorFondo);
			
		}
		
		private Color ColorFondo;
	}

}

