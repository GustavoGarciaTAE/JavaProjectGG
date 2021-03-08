import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
		
		int num_alet[] = new int[elementos];
		
		for (int i = 0; i < num_alet.length; i++) {
			
			num_alet[i] = (int)(Math.random()*100);
			
		}

		for (int elem: num_alet) {
			
			System.out.println(elem);
		}
	}

}
