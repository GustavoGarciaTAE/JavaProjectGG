import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		
		int aleatorio = (int) (Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0;
		
		int intento = 0;
		
		do {
			
			intento++;
			
			System.out.println("Ingrese un numero:");
			
			n1 = entrada.nextInt();
			
			if (aleatorio < n1) {
				
				System.out.println("Mas bajo");
			}
			else if (aleatorio > n1) {
				
				System.out.println("Mas alto");
			}
			
			if (intento==10) {
				
				System.out.println("Supero 10 intentos, perdio!");
				
				return;
			}
			
		}while (aleatorio != n1);
		
		System.out.println("Correcto! Lo haz logrado despues de " + intento + " intentos.");
	}

}
