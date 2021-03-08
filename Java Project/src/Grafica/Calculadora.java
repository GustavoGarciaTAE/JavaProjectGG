package Grafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora marco = new MarcoCalculadora();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);
		
	}

}

class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora () {
		
		setTitle("Calculadora");
		
		setBounds(150, 150, 450, 300);
		
		add(new LaminaCalculadora());
		
		//pack(); // Se adapta al tamaño de los objetos
			
	}
	
}

class LaminaCalculadora extends JPanel {
	
	public LaminaCalculadora () {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false); // metodo para cambiar el aspecto del botón
		
		add(pantalla, BorderLayout.CENTER);
		
		milamina2 = new JPanel ();
		
		milamina2.setLayout(new GridLayout(4, 4));
		
		InsertaNumero insertar = new InsertaNumero();
		
		AccionOrden orden = new AccionOrden();
		
		ponerBoton("7", insertar);
		
		ponerBoton("8", insertar);
		
		ponerBoton("9", insertar);
		
		ponerBoton("/",orden);
		
		ponerBoton("4", insertar);
		
		ponerBoton("5", insertar);
		
		ponerBoton("6", insertar);
		
		ponerBoton("*",orden);
		
		ponerBoton("1", insertar);
		
		ponerBoton("2", insertar);
		
		ponerBoton("3", insertar);
		
		ponerBoton(".", insertar);
		
		ponerBoton("0", insertar);
		
		ponerBoton("-",orden);
		
		ponerBoton("+",orden);
		
		ponerBoton("=",orden);
		
		add(milamina2, BorderLayout.SOUTH);
		
		UltimaOperacion = "=";
		
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton (rotulo);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand(); // Toma el texto del boton
			
			if (principio) { // Lo que hace este if es borrar el 0 y poner una cadena vacia en el display
				
				pantalla.setText("");
				
				principio = false;
				
			}
			
			pantalla.setText(pantalla.getText() + entrada); // Con esto concatena lo anterior con lo nuevo
			
		}
		
	}
	
	private class AccionOrden implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String operacion = e.getActionCommand();  // Toma el texto del botón
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			UltimaOperacion = operacion;
			
			principio = true;
			
		}
		
		public void calcular (double x) { // X captura lo que actualmente esta en pantalla
			
			if (UltimaOperacion.equals("+")) {
				
				resultado+=x;
				
			}
			else if (UltimaOperacion.equals("-")) {
				
				resultado-=x;
				
			}
			else if (UltimaOperacion.equals("*")) {
				
				resultado*=x;
				
			}
			else if (UltimaOperacion.equals("/")) {
				
				resultado/=x;
				
			}
			else if (UltimaOperacion.equals("=")) {
				
				resultado = x;
				
			}
		
			pantalla.setText("" + resultado); // Se concateno por que resultado es double y el metodo setText recibe como parametro un string
			
		}
		
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio; // Si una variable booleana no se inicia su valor es false
	
	private double resultado;
	
	private String UltimaOperacion;
}
