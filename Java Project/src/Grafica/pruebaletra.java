package Grafica;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class pruebaletra {

	public static void main(String[] args) {
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean esta = false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String nombredelafuente: nombresDeFuentes) {
			
			if (nombredelafuente.equals(fuente)) {
				
				esta = true;
			}
			
		}
		
		if (esta) {
			
			System.out.println("Fuente instalada");
			
		} else {
			
			System.out.println("No esta la fuente");
		}
		
		
		
	}

}
