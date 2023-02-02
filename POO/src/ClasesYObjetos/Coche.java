/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

/**
 *
 * @author noral
 */
public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	//Método 1
	public static void main(String[] args) {
		Coche coche1 = new Coche();
		
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;
		
		System.out.println("El color del coche1 es: "+coche1.color);
		System.out.println("La marca del coche1 es: "+coche1.marca);
		System.out.println("El kilometraje del coche1 es: "+coche1.km);
		 
	//Método 2	
		Coche coche2 = new Coche();
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;
		
		System.out.println("\nEl color del coche2 es: "+coche2.color);
		System.out.println("La marca del coche2 es: "+coche2.marca);
		System.out.println("El kilometraje del coche2 es: "+coche2.km);
	}
}
