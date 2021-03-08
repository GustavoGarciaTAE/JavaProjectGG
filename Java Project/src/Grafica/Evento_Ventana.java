package Grafica;

import java.awt.event.WindowAdapter;
import java.awt.event.*;

import javax.swing.*;

public class Evento_Ventana {

	public static void main(String[] args) {
		
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana mimarco2 = new MarcoVentana ();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo una ventana
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(100, 300, 500, 350);
		
		mimarco2.setBounds(700, 300, 500, 350);
	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana () {
		
		//setTitle ("Respondiendo");
		
		//setBounds (200, 200, 500, 350);
		
		setVisible(true);
		
		//M_Ventana oyente = new M_Ventana();     **********
		
		//addWindowListener(oyente); // De esta manera se pone a la escucha    *************
		
		addWindowListener(new M_Ventana());
	}
	
}

class M_Ventana extends WindowAdapter { // Clase oyente
	

public void windowIconified(WindowEvent e) {
	
	System.out.println("Ventana minimizada");
	
	}

}

