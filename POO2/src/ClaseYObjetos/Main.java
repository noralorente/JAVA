/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseYObjetos;

/**
 *
 * @author noral
 */
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		Operacion op = new Operacion();
		
		int suma = op.sumar(n1, n2);
		int resta = op.restar(n1, n2);
		int mult = op.multiplicar(n1, n2);
		int div = op.dividir(n1, n2);
		
		op.mostrarResultados(suma, resta, mult, div);
		
		/*Tambien podemos imprimir directamente desde el método:
		System.out.println("La suma es: "+ op.sumar(n1,n2));
		
		QUITANDO EL MÉTODO:
		op.mostrarResultados(suma, resta, mult, div);
		
		Y BORRANDO DE LA CLASE "OPERACIÓN":
			public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicación es: "+multiplicacion);
		System.out.println("La división es: "+division);
	}
		*/
	}
}
