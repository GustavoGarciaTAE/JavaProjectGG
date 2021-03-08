
public class Array_2D {

	public static void main(String[] args) {
		
		double acumulado;
		
		double interes = 0.10;
		
		double [][] saldo = new double [6] [5];
		
		for (int g=0; g<6; g++) {
			
			saldo [g] [0] = 10000;
			
			acumulado = 10000;
			
			for (int m=1; m<5; m++) {
				
				acumulado = acumulado + (acumulado * interes);
				
				saldo [g] [m] = acumulado;
				
			}
			
			interes = interes + 0.01;
		}
		
		for (int z=0; z<6; z++) {
			
			System.out.println();
			
			for (int h=0; h<5; h++) {
				
				System.out.printf("%1.2f", saldo [z][h]);

				System.out.print(" ");
			}
		}
	}

}
