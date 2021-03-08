package Grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ESCRIBIENDO {

	public static void main(String[] args) {

	MarcoEscribe Marco = new MarcoEscribe();
	
	Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Marco.setVisible(true);
	
	Marco.setBounds(200, 200, 650, 300);
	
	Marco.setBackground(new Color(0, 0, 0));
	
	}

}

class MarcoEscribe extends JFrame {
	
	public MarcoEscribe() {
		
	LaminaEscribe llamaLamina = new LaminaEscribe ();
	
	add(llamaLamina);
	
	LaminaKey KeyW = new LaminaKey();
	
	addKeyListener(KeyW);
	
	mouse rata = new mouse();
	
	addMouseListener(rata);
	
	propia change = new propia ();
	
	addWindowStateListener(change);

	}
}

class LaminaEscribe extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.CYAN);
		
		g.drawLine(100, 100, 100,200);
		
		g.drawString("Learning", 110, 100);
		
		g.drawOval(180, 180, 50, 15);
		
		g.fillOval(280, 180, 20, 20);
		
	}
	
}

class LaminaKey implements KeyListener {

	
	public void keyPressed(KeyEvent e) {
		
		int get = e.getKeyCode();
		
		System.out.println(get);
		
		
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void keyTyped(KeyEvent e) {
		
	}
	
}

class mouse implements MouseListener {

	
	public void mouseClicked(MouseEvent g) {
		
	}

	
	public void mouseEntered(MouseEvent g) {
		
		
	}

	
	public void mouseExited(MouseEvent g) {
		
		
	}

	
	public void mousePressed(MouseEvent g) {
		
		System.out.println(g.getModifiersEx());
		
	}

	
	public void mouseReleased(MouseEvent g) {
	
		
	}
	
	
	
}

class propia implements WindowStateListener{

	
	public void windowStateChanged(WindowEvent e) {
		
		int norm = e.getNewState();
		
		System.out.println(norm);
		
	}
	
}




