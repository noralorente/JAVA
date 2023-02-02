/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechahora;

import java.util.Date;

/**
 *
 * @author noral
 */
public class FechaHora {

	private static Date fecha = new Date();

	public static void main(String[] args) {
		
		System.out.println("Fecha y hora: "+fecha);
		System.out.println("Día: "+fecha.getDate());
		System.out.println("Mes: "+fecha.getMonth()+1); //Java empieza a contar desde 0 por lo que hay que sumar 1.
		System.out.println("Año: "+(fecha.getYear()+1900)); // Hay que sumar 1900 para que nos de el año actual.
		
		System.out.println("\nHora: "+fecha.getHours());
		System.out.println("Minuto: "+fecha.getMinutes());
		System.out.println("Segundo: "+fecha.getSeconds());
	}
	
}
