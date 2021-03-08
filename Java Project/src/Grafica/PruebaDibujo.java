package Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
	
		MarcoConDibujos  mimarco = new MarcoConDibujos();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setBackground(Color.green);
		
		mimarco.setBackground(SystemColor.window);
		
		mimarco.setForeground(Color.blue);
	}

}


class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos () {
		
		setTitle ("Prueba de dibujos");
		
		setSize (500, 500);
		
		LaminaConFiguras milamina = new LaminaConFiguras();
		
		add(milamina);

		milamina.setBackground(Color.pink); // No tomo el color el balaperra
		
		milamina.setBackground(SystemColor.window); // No tomo el color el balaperra
		
		
	}
	
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent (Graphics g) {
		
		super.paintComponents(g); // llamado al metodo de la clase padre
		
		Graphics2D g2 = (Graphics2D) g; // refundicion o casteo
		
		Font mifuente = new Font ("Arial",Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.blue);
		
		g2.drawString("Gus", 80, 40);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		
		g2.setColor(new Color (128, 95, 80));
		
		g2.drawString("Curso de Java", 90, 60);
		
		// Dibujando el rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.magenta);
		
		g2.draw(rectangulo);
		
		g2.setColor(Color.blue);
		
		g2.fill(rectangulo);
		
		// Dibujando la elipse
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(new Color(0, 140, 255)); // instancio con new para llamar el metodo constructor de la clase color
		
		g2.fill(elipse);
		
		// Dibujando linea
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroenX = rectangulo.getCenterX();
		
		double CentroenY = rectangulo.getCenterY();
		
		double radio = 150;
		
		// Dibujando circulo
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
		
		Color micolor = new Color(255, 255, 255);
		
		g2.setPaint(micolor);
		
		g2.draw(circulo);
		

		
		//g.drawRect(50, 50, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawArc(50, 100, 100, 200, 180, 100);
	}
	
}