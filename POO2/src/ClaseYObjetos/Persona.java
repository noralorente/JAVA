/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseYObjetos;

/**
 *
 * @author noral
 */
public class Persona {
	//Atributos
	String nombre;
	int edad;
	
	//Método Constructor
	public Persona(String _nombre, int _edad){
		nombre = _nombre;
		edad = _edad;
	}
	
	public void mostrarDatos(){
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
}
