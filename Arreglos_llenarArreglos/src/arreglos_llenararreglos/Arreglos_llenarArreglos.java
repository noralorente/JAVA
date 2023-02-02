/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos_llenararreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author noral
 */
public class Arreglos_llenarArreglos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo:  "));
		
		char[] letras = new char[nElementos];
		
		System.out.println("Digite los elementos del arreglo: ");
		for(int i=0;i<nElementos;i++){
			System.out.println((i+1)+". Digite un caracter: ");
			letras[i] = entrada.next().charAt(0);
		}
	
	}
	
	
}
