/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

public class Pizzeria {
	public static void main(String[] args) {
		Repartidor r = new Repartidor();
		
		r.monitorizar();
		
		r.hacerReparto(10);
		r.monitorizar();
		
		r.hacerReparto(10);
		r.monitorizar();
		
		/* Un número de repartos efectuados, 
		que se va incrementando a lo largo de la jornada, 
		hasta alcanzar el número máximo de repartos que puede 
		hacer un repartidor, que es de 5 repartos (valor fijo para todos los repartidores).*/
		
		r.hacerReparto(5);
		r.monitorizar();
		
	}
}
