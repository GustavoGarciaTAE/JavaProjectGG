package Grafica;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		
		EventoRaton mimarco = new EventoRaton ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class EventoRaton extends JFrame {
	
	public EventoRaton () {
		
	setVisible(true);
	
	setBounds(200, 200, 500, 450);
	
	EventosDeRaton EventoRaton = new EventosDeRaton();
	
	addMouseMotionListener(EventoRaton);
		
	}
	
}

/*
class EventosDeRaton extends MouseAdapter {

	public void mouseClicked (MouseEvent e) {
	
		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		 * 
		System.out.println(e.getClickCount());
	}*/
	
	/*
	public void mousePressed (MouseEvent e) {
		
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Ha oprimido el boton izquierdo");
			
		}
		else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Ha oprimido la rueda");
			
		}
		else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Ha oprimido el boton derecha");
			
		}
	}
	
} */

class EventosDeRaton implements MouseMotionListener {

	public void mouseDragged(MouseEvent arg0) {
		
		System.out.println("Estas arrastrando");
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
		System.out.println("Estas moviendo");
		
	}
	
	
	
}