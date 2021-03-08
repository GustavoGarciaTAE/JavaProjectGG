package Grafica;

import java.awt.*;

import javax.swing.*;

public class Layout {

	public static void main(String[] args) {
		
		Marco_Layout marco = new Marco_Layout();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_Layout extends JFrame {
	
	public Marco_Layout () {
		
		setTitle("Prueba Acciones");
		
		setBounds(100, 100, 550, 450);
		
		Lamina_Layout lamina = new Lamina_Layout();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEADING);

		//lamina.setLayout(disposicion);
		
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		add(lamina, BorderLayout.NORTH);	
		
		add(lamina2, BorderLayout.SOUTH);
	}
	
}

class Lamina_Layout extends JPanel {
	
	public Lamina_Layout() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER, 110, 150));
		
		setLayout (new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Azul"));
		
	}
	
}

class Panel_Layout2 extends JPanel {
	
	public Panel_Layout2 () {
		
		setLayout (new BorderLayout());
		
		add(new JButton("Rojo"), BorderLayout.WEST);
		
		add(new JButton("Morado"), BorderLayout.EAST);
		
		add(new JButton("verde"), BorderLayout.CENTER);
		
	}
	
}