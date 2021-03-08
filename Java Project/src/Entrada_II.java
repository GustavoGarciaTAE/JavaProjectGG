import javax.swing.JOptionPane;

public class Entrada_II {

	public static void main(String[] args) {
	
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		//int edadUsuario = Integer.parseInt(edad);
		
		edad++;
				
		System.out.println ("Hola " + nombreUsuario + "! el proximo año tendras " + edad + " años.");

	}

}

