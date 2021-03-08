
public class ManipulacionCadenas {

	public static void main(String[] args) {
		
		String nombre = "Dylan Santiago";
		
		System.out.println("Mi nickname es: " + nombre);
		
		System.out.println("Mi nickname tiene: " + nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nickname es: " + nombre.charAt(0));
		
		int ultima_letra;
		
		ultima_letra = nombre.length();
		
		System.out.println("La ultima letra es: " + nombre.charAt(ultima_letra-1));
	}

}
