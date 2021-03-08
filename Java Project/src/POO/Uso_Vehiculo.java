package POO;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*
		
		Auto renault = new Auto(); // Instanciar una clase, ejemplar una clase
		
		System.out.println(renault.dime_datos_generales());
		
		renault.estable_Color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(renault.dime_color());
		
		renault.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		
		System.out.println(renault.dime_asientos());
		
		renault.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(renault.dime_climatizador());
		
		System.out.println(renault.dime_peso_Coche());
		
		System.out.println("El precio final del carro es: " + renault.precio_coche());
		
		*/
		
		Auto micoche1 = new Auto ();
		
		micoche1.estable_Color("Rojo");

		Furgoneta mifurgoneta1 = new Furgoneta (7, 580);
	
		mifurgoneta1.estable_Color("Azul");
		
		mifurgoneta1.configura_asientos("si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta() );
	}

}
