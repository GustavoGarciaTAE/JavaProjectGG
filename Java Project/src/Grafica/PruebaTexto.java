package Grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {

		MarcoTexto marco = new MarcoTexto();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto extends JFrame {
	
	public MarcoTexto () {
		
		setBounds(150, 150, 450, 300);
		
		setTitle("Textos con JTextField y JTextArea");
		
		add(new LaminaTexto());
		
		setVisible(true);
				
	}
	
}

class LaminaTexto extends JPanel {
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
	
		JPanel lamina2 = new JPanel();
		
		lamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("", JLabel.CENTER);
				
		JLabel texto1 = new JLabel("Email: ");
		
		lamina2.add(texto1);
		
		campo1 = new JTextField(20);
		
		lamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton boton = new JButton("Comprobar");
		
		DameTexto evento = new DameTexto();
		
		boton.addActionListener(evento);
		
		lamina2.add(boton);
		
		add(lamina2, BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {

		int correcto = 0;
		
		String email = campo1.getText().trim();
		
		for (int i=0; i<email.length(); i++) {
			
			if (email.charAt(i)=='@') {
				
				correcto++;
				
			}
			
		}
		
		if (correcto!=1) {
			
			resultado.setText("Incorrecto");
			
		}
		else {
		
			resultado.setText("Correcto");
		}
			
		}
		
	}
	
	private JTextField campo1;
	
	private JLabel resultado;
}
