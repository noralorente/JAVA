/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


/**
 *
 * @author noral
 */
public class Jugador {
	private char jugador;

	public Jugador(char jugador) {
		this.jugador = jugador;
	}

	public void setJugador(char jugador) {
		this.jugador = jugador;
	}

	public void avanzar (int pasos){
		if(pasos<0){
			throw new IllegalArgumentException("Este argumento no es válido.");
		}else if(pasos==0){
			System.out.println(jugador);
		}else if(pasos>0){
			for(int i= 0 ; i< pasos; i++)
			{
				System.out.println("\n.");
			}
			System.out.println("\n"+jugador);
		}
	}
	
}
