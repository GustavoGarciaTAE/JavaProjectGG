import javax.swing.JOptionPane;

public class while_compara {

	public static void main(String[] args) {
		
		int n1 = 18;
		int n2 = 0;
		
		while (n2 <= n1) {
	
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
			
			if (n2 < n1) {
			
				System.out.println("Numero menor");
			}
			
			else if (n2 == n1) {
				
				System.out.println("Numero igual");
			}
		}
		
		System.out.println("Numero mayor!");
	}

}
