package Grafica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosConTeclas {

	public static void main(String[] args) {
		
		MarcoConTeclas mimarco = new MarcoConTeclas();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame {
	
	public MarcoConTeclas() {
		
		setVisible(true);
		
		setBounds(150, 150, 250, 250);
		
	EventoDeTeclado miteclado = new EventoDeTeclado();
	
	addKeyListener(miteclado);  // para poner a la escucha
		
	}
	
}

class EventoDeTeclado implements KeyListener {

	public void keyPressed(KeyEvent e) {
		
		int codigo = e.getKeyCode();
		
		System.out.print(codigo + " = ");
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
	 char letra = e.getKeyChar();
	 
	 System.out.println(letra);
		
	}
	
}