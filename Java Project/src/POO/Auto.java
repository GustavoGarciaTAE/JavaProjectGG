package POO;

public class Auto {

	 private int ruedas;
	 
	 private int largo;
	  
	 private int ancho;
	 
	 private int motor;
	 
	 private int peso_plataforma;
	 
	 private String color;
	 
	 private int peso_total;
	 
	 private boolean asientos_cuero, climatizador;
	 
	 public Auto () { // Metodo constructor
		 
		 ruedas = 4;
		 
		 largo = 2000;
		 
		 ancho = 300;
		 
		 motor = 1600;
		 
		 peso_plataforma = 500;
		
	 }

	 
	 public String dime_datos_generales() { // Metodo Getter: Devuelve  el valor de las propiedades de los objetos
		
		 return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
		 ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
		 " cm y un peso de plataforma de " + peso_plataforma + " kg";
		 
	 }
	 
	 public void estable_Color (String color_carro) { // Metodo Setter: Modifica el valor de las propiedades de los objetos
		 
		 color = color_carro;
		 
	 }
	 
	 public String dime_color () { // GETTER
		 
		 return "El color del carro es: " + color;
		 
	 }
	 
	 public void configura_asientos (String asientos_cuero) { // SETTER
		 
		 if (asientos_cuero.equalsIgnoreCase("si")) {
			 
			 this.asientos_cuero = true;
		 }
		 else {
			 this.asientos_cuero = false;
		 }
	 }
	 
	 public String dime_asientos () { // GETTER
		 
		 if (asientos_cuero == true) {
			 return "El carro tiene asientos de cuero";
		 }
		 else {
			 return "El carro tiene asientos de serie";
		 }
	 }
	 
	 public void configura_climatizador (String climatizador) { // SETTER
		 
		 if (climatizador.equalsIgnoreCase("si")) {
			 
			 this.climatizador = true;
	
		 }
		 else {
			 
			 this.climatizador = false;
		 }
		 
	 }

	 public String dime_climatizador () {
		 
		 if (climatizador == true) {
			 
			 return "El carro incorpora climatizador";
		 } 
		 else
		 {
			 return "El coche lleva aire acondicionado";
		 }
			 
	 }
	 
	 public String dime_peso_Coche () { // SETTER + GETTER
		 
		 int peso_carroceria = 500;
		 
		 peso_total = peso_plataforma + peso_carroceria;
		 
		 if (asientos_cuero == true) {
			 
			 peso_total = peso_total + 50;
		 }
		 if (climatizador == true) {
			 peso_total = peso_total + 20;
		 }
		 
		 return "El peso del coche es " + peso_total;
	 }
	 
	 public int precio_coche () {
		 
		 int precio_final = 10000;
		 
		 if (asientos_cuero == true) {
			 
			 precio_final += 2000; 
			 
		 }
		 if (climatizador == true) {
			 precio_final +=1500;
		 }
		 
		 return precio_final;
	 }
}