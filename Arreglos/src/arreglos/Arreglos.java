/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author noral
 */
public class Arreglos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[] numeros = new int[3];
		
		numeros[0] = 7;
		numeros[1] = 10;
		numeros[2] = 13;
		
		/* Otra forma de hacerlo es así:
			int[] numeros = {5,7,9};		
		*/
		
		for(int i=0;i<3;i++){
			System.out.println(numeros[i]);
		}
		
	}
	
}
