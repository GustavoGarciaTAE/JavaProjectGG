package Grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		MarcoAccion marco = new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoAccion extends JFrame {
	
	public MarcoAccion () {
		
		setVisible(true);
	
		setBounds(100, 100, 600, 450);
		
		/*
		PanelAccion lamina = new PanelAccion();
		add(lamina);
		*/
		
		add(new PanelAccion());
		
	}
	
}

class PanelAccion extends JPanel {
	
	public PanelAccion() {
		
		
		ActionColor accionAmarillo = new ActionColor("Amarrillo", new ImageIcon("src/Grafica/bola_amarilla.png"), Color.yellow);
		ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("src/Grafica/bola_azul.png"), Color.blue);
		ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("src/Grafica/bola_roja.png"), Color.red);
		
		
		/*JButton BotonAmarillo = new JButton(accionAmarillo);
		add(BotonAmarillo);
		*/
		
		add(new JButton(accionAmarillo));
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionRojo));
		
		/*
		JButton BotonAmarillo = new JButton("Amarrillo");
		JButton BotonAzul = new JButton("Azul");
		JButton BotonRojo = new JButton("Rojo");
		
		add(BotonAmarillo);
		add(BotonAzul);
		add(BotonRojo);
		*/
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); // 1.Mapa de entrada
		
		//KeyStroke teaclaAmarillo = KeyStroke.getKeyStroke("ctrl A"); // 2.Combinacion de tecla
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo_amarillo"); // 3.asignacion combinacion a un objeto
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "Fondo_azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("Fondo_amarillo", accionAmarillo); // 4.Asignar objeto a una accion
		
		mapaAccion.put("Fondo_azul", accionAzul);
		
		mapaAccion.put("Fondo_rojo", accionRojo);
		
	}
	
	private class ActionColor extends AbstractAction { // Clase oyente
		
		public ActionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			
			putValue("Color_de_fondo", color_boton);
			
		}

		public void actionPerformed(ActionEvent e) {
				
			Color c= (Color) getValue("Color_de_fondo");
			
			setBackground(c); // Por este motivo se conierte en clase interna, por que el metodo no es reconocido como clase normal
			
			System.out.println("Nombre " + getValue(Action.NAME) + " \n Descripcion " + getValue(Action.SHORT_DESCRIPTION));
		}

	}
	
}


