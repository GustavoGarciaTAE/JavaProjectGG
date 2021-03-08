import javax.swing.JOptionPane;

public class Uso_Array_II {

	public static void main(String[] args) {
		
		/*
		String [] paises = new String [8];
		
		for (int x=0; x<8; x++) {
			paises [x] = JOptionPane.showInputDialog("Introduce pais " + (x+1));
		}
		
		for (String g:paises) {  // bucle for each
			
			System.out.println(g);
			
		}
		*/
		
		int [] matriz_aleatorios = new int[150];

		for (int i=0; i<matriz_aleatorios.length; i++) {
			
			matriz_aleatorios [i] = (int) (Math.random()*100);
		}
		
		for (int numeros:matriz_aleatorios) {
			
			System.out.print(numeros + " ");
			
		}
	}

}
