package Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Varios_Oyentes {

	public static void main(String[] args) {
		
	Marco_Principal marco = new Marco_Principal();

	marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_Principal extends JFrame {
	
	public Marco_Principal () {
		
		setVisible(true);
		
		setBounds(750, 150, 300, 250);
		
		Lamina_Principal lamina = new Lamina_Principal();
		
		add(lamina);
	}
	
}

class Lamina_Principal extends JPanel {
	
	public Lamina_Principal() {
		
		JButton boton_nuevo = new JButton ("Nuevo");
		
		add (boton_nuevo);
		
		boton_cerrar = new JButton ("Cerrar todo");
		
		add(boton_cerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyente);
		
	}
	
	private class OyenteNuevo implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
		}
		
	}
	
	JButton boton_cerrar;
}

class Marco_Emergente extends JFrame {
	
	public Marco_Emergente (JButton boton_de_principal) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 250);
		
		CierraTodo oyenteCerrar = new CierraTodo();
		
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
		
	}
	private static int contador=0; // Static para que sea compartida en todas las instancias que cree
	
}