package Grafica;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Cambio_Estado {

	public static void main(String[] args) {
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame {
	
	public MarcoEstado() {
		
		setVisible(true);
		
		setBounds(200, 200, 450, 400);
		
		setTitle ("Desencadenador de eventos");
		
		CambiaEstado nuevoEstado = new CambiaEstado();
		
		addWindowStateListener(nuevoEstado);
	}
	
}

class CambiaEstado implements WindowStateListener {
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado");
		
		System.out.println(e.getNewState());
		
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta a pantalla completa");
			
		}
		else if (e.getNewState()==Frame.NORMAL) {
			
			System.out.println("La ventana esta a normal");
			
		}
		else if (e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana esta minimizada");
		}
		
	}
}
