package POO;

public class Furgoneta extends Auto{ // Furgoneta es una subclase y Auto una super clase ó (Clase hija y clase padre) 

	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta (int plazas_extra, int capacidad_carga) { // Metodo constructor

		super (); // llamar al constructor de la clase padre.
		
		this.capacidad_carga = capacidad_carga;
		
		this.plazas_extra = plazas_extra;
		
	}
	
	public String dimeDatosFurgoneta () { // Metodo Getter
		
		return "La capacidad de carga es: " + capacidad_carga + " y las plazaas son: " + plazas_extra;
	}
		
	
	
}
 