/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author noral
 */
public class Calculadora {

	public static void main(String[] args) {
		Calculadora calculator = new Calculadora();
		double media = calculator.average(5, 10);
		System.out.println("La media es: " + media);
	}

	public double average(double n1, double n2) {
		double result = (n1 + n2) / 2;
		return result;
	}
}
