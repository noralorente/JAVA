//Miembros estáticos de una clase.
package paquete1;

/**
 *
 * @author noral
 */
public class Estatico {
	private static String frase = "Primera frase";
	
	public static int sumar(int n1,int n2){
		int suma = n1+n2;
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println(Estatico.frase);
		System.out.println("La suma es: "+Estatico.sumar(3, 4));
	}
}	
	
	
	
	/*Cuando ponemos static a un método, este pasa a pertenecer
	  a la clase y no a los objetos.*/
	
	
	
	//Ejemplo usando objetos ya que el método no es estático.
	
	/*private String frase = "Primera frase";	
	
	
	public static void main(String[] args) {
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase = "Segunda frase"; 
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
	}*/

