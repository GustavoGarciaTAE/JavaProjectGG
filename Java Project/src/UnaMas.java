import javax.swing.JOptionPane;

public class UnaMas {

	public static void main(String[] args) {

		int cont = 18;
		
		int num = 0;
		
		while (cont >= num) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
			
			System.out.println("Es menor de edad");
		}

		JOptionPane.showInputDialog("Registro de edad exitoso", JOptionPane.WARNING_MESSAGE);
	}

}
