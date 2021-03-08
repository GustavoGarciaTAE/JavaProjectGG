import javax.swing.JOptionPane;

public class and {

	public static void main(String[] args) {
		
		int ho = 0;
		
		do {
			
		System.out.println("Nada");
		
		ho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
		
		} while(ho<5 || ho>14);

	}

}
