package Grafica;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaJLabel {

	public static void main(String[] args) {
		
		MarcoPrueba marco = new MarcoPrueba();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame {
	
	public MarcoPrueba () {
		
		setBounds(150, 100, 350, 350);
		
		LaminaPrueba milamina = new LaminaPrueba();
		
		add(milamina);
		
		setVisible(true);
	}
	
}

class LaminaPrueba extends JPanel {
	
	public LaminaPrueba() {
		
		JTextField campo = new JTextField(20);
		
		EscuchaTexto ElEvento = new EscuchaTexto();
		
		Document doc = campo.getDocument();
		
		doc.addDocumentListener(ElEvento);
		
		add(campo);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		public void changedUpdate(DocumentEvent arg0) {
			
			
		}

		public void insertUpdate(DocumentEvent arg0) {
			
			System.out.println("Se ha insertado texto");
			
		}


		public void removeUpdate(DocumentEvent arg0) {
		
			System.out.println("Se removio texto");
			
		}
		
		
	}
	
}