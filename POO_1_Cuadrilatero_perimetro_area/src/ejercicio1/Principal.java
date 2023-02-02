/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author noral
 */
public class Principal {
	public static void main(String[] args) {
		Cuadrilatero c1;
		float lado1, lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog ("Digite el lado 2: "));
		
		if(lado1 == lado2){ //Es un cuadrado
			c1 = new Cuadrilatero(lado1);
		}
		else{
			c1 = new Cuadrilatero(lado1, lado2);
		}
		
		System.out.println("El perímetro es: "+c1.getPerimetro());
		System.out.println("El área es: "+c1.getArea());
		
	}
}
