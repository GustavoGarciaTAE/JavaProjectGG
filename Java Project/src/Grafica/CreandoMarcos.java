package Grafica;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco ();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame {
	
	public miMarco () {
	
		//setSize(500,300);
		
		//setLocation(500,100);
		
		setBounds(500, 300, 550, 250);
		
		setResizable(false); // No permite redimensionar la pantalla y tampoco permite maximizar
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
	}
	
}
