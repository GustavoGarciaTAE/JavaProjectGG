
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		
		int [][] matrix = new int [4] [5];

		  matrix [0][0]=15;
		  matrix [0][1]=20;
		  matrix [0][2]=23;
		  matrix [0][3]=32;
		  matrix [0][4]=15;
		  
		  matrix [1][0]=18;
		  matrix [1][1]=44;
		  matrix [1][2]=42;
		  matrix [1][3]=20;
		  matrix [1][4]=13;
		  
		  matrix [2][0]=14;
		  matrix [2][1]=18;
		  matrix [2][2]=21;
		  matrix [2][3]=23;
		  matrix [2][4]=55;
		  
		  matrix [3][0]=41;
		  matrix [3][1]=82;
		  matrix [3][2]=76;
		  matrix [3][3]=56;
		  matrix [3][4]=2;
		  
		   for (int g=0; g<4; g++) {
			  
			  System.out.println();
			  
			  for (int h=0;h<5;h++) {
				  
				  System.out.print(matrix [g][h] + " ");
				  
				   }
			  }
		  
		/*
		int [] [] matrix = {
				{15, 48, 95, 61, 24},
				{18, 94, 51, 75, 53},
				{94, 75, 16, 34, 19},
				{84, 92, 16, 48, 76}
		};
		  */
		  		
		   System.out.println();System.out.println();
		   
		for (int []fila:matrix) { // forma mas rapida de crear una matriz, a partir de  una existente
			
			System.out.println();
						
			for (int z: fila) {
				
				System.out.print(z + " ");
				
		  }
				
		}
				  
	  }
		 
	}


