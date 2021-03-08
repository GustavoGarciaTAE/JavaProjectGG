package Grafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class AAALamina {

	public static void main(String[] args) {
		
		marcoT marco = new marcoT();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoT extends JFrame {
	
	public marcoT () {
		
		setBounds(150, 150, 400, 450);
		
		laminaT lamina = new laminaT();
		
		add(lamina);
		
		setVisible(true);
		
	}
}

class laminaT extends JPanel {
	
	public laminaT () {
		
		setBackground(Color.BLUE);
		
		setLayout(new BorderLayout());
		
		JButton boton1 = new JButton("Pruebas");
		
		add(boton1, BorderLayout.SOUTH);
		
		JPanel lamina2 = new JPanel();
		
		lamina2.setLayout(new FlowLayout());
		
		add(lamina2, BorderLayout.NORTH);
		
		lamina2.setBackground(Color.green);
		
		JButton botonC = new JButton("core");
		
		lamina2.add(botonC);
		
		botonC.addKeyListener(new tecladoAccion());
		
		JPanel lamina3 = new JPanel();
	
		lamina3.setLayout(new FlowLayout());
		
		JButton botonM = new JButton("Contingence");
		
		lamina3.add(botonM);
		
		lamina3.setBackground(new Color(254, 200, 30));
		
		botonM.addMouseListener(new ratonAccion());

		add(lamina3, BorderLayout.WEST);
	}
	
	private class tecladoAccion implements KeyListener {

		public void keyPressed(KeyEvent e) {
		
			
		}

		public void keyReleased(KeyEvent e) {
		
			
		}

		public void keyTyped(KeyEvent e) {
		
		char letra = e.getKeyChar();
	
		System.out.println(letra);
			
		}
		
	}
	
	private class ratonAccion implements MouseListener {

		
		public void mouseClicked(MouseEvent arg0) {
			
			
		}

		
		public void mouseEntered(MouseEvent arg0) {
			
			
		}

		
		public void mouseExited(MouseEvent arg0) {
			
			
		}

		
		public void mousePressed(MouseEvent arg0) {
			
			System.out.println("Lo ha presionado, como es, como seria");
			
		}

		
		public void mouseReleased(MouseEvent arg0) {
			
			System.out.println("Se ha liberado");
			
		}
		
	}
	
	
}