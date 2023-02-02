/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

/**
 *
 * @author noral
 */
public class Persona {
	//Atributos
	String nombre;
	int edad;
	String dni;
	
	//Métodos

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String dni) {
		this.dni = dni;
	}
	
	public void correr(){
		System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón.");
	}
	
	public void correr(int km){
		System.out.println("He corrido "+km+" kilómetros.");
	}
}
