package Grafica;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.ImageIO;

public class PruebaImagen {

	public static void main(String[] args) {
		
		MarcoImagen mimarco = new MarcoImagen ();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame {
	
	public MarcoImagen () {
		
		setTitle ("Marco con Imagen");
		
		setBounds (50, 50, 700, 600);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
	}
	
}

class LaminaConImagen extends JPanel {
	
	public LaminaConImagen() { // Con este metodo cargo la imagen a la memoria
		
		try  {
			
			imagen = ImageIO.read(new File ("src/Grafica/html.png"));
			
			}
			catch (IOException e) {
				
				System.out.println("La imagen no se encuentra");
			}
		
	}
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
				
		int anchura = imagen.getWidth(this);
		
		int altura = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i=0; i<4; i++) {
			
			System.out.println();
			
			for (int h=0; h<2; h++) {
				
				if (i+h>0) {
					
				g.copyArea(0, 0, anchura, altura, anchura*i, altura*h);
				
				}
			}
		}

	}
	
	private Image imagen;
}
