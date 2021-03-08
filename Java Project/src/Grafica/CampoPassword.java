package Grafica;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		
		MarcoPass marco = new MarcoPass();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPass extends JFrame {
	
	public MarcoPass() {
		
		setBounds(150, 100, 450, 450);
		
		LaminaPass lamina = new LaminaPass();
		
		add(lamina);
		
		setVisible(true);
	}
}

class LaminaPass extends JPanel {
	
	public LaminaPass () {
		
		setLayout(new BorderLayout());
		
		JPanel laminasuperior = new JPanel();
		
		laminasuperior.setLayout(new GridLayout(2, 2));
		
		add(laminasuperior, BorderLayout.NORTH);
		
		JLabel etiqueta1 = new JLabel ("Usuario");
		
		JLabel etiqueta2 = new JLabel ("Contraseña");
		
		JTextField Usuario = new JTextField(15);
		
		JPasswordField contraseña = new JPasswordField(15);
		
		laminasuperior.add(etiqueta1);
		
		laminasuperior.add(Usuario);
		
		laminasuperior.add(etiqueta2);
		
		laminasuperior.add(contraseña);
		
		JButton enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
	}
	
	private class CompuestasPass implements DocumentListener {


		public void changedUpdate(DocumentEvent arg0) {
			
			
		}

		public void insertUpdate(DocumentEvent arg0) {
			
			
		}

		public void removeUpdate(DocumentEvent arg0) {
			
			
		}
		
		
		
	}
}