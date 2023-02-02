/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author noral
 */
public class Principal {
	public static int indiceCocheMBarato(Vehiculo coches[]){
		float precio;
		int indice=0;
		
		//precio = coches[0].getPrecio();
		precio = coches[0].getPrecio();
		for(int i=1;i<coches.length;i++){
			if (coches[i].getPrecio()<precio) {
				precio = coches[i].getPrecio();
				indice=i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numeroVehiculos, indiceBarato;
		
		System.out.println("Digite la cantidad de vehículos: ");
		numeroVehiculos = entrada.nextInt();
		
		//Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		
		for(int i=0;i<coches.length;i++){
			entrada.nextLine(); //Ponemos esto para evitar que se junte los string a la hora de pedir los datos. 
			System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
			System.out.println("Introduce Marca: ");
			marca = entrada.nextLine();
			System.out.println("Introduce Modelo: ");
			modelo = entrada.nextLine();
			System.out.println("Introduce Precio: ");
			precio=entrada.nextFloat();
			
			coches[i]=new Vehiculo(marca,modelo,precio);
		}
		
		indiceBarato = indiceCocheMBarato(coches);
		System.out.println("\nEl coche más barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
	}
}
