/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author noral
 */
public class Fecha {
	private int año;
	private int mes;
	private int dia;

	public Fecha(int año, int mes, int dia) {
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAño() {
		return año;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}
	

	public String toString(){
		if (dia<=0 || dia>31){
			throw new IllegalArgumentException("Debes introducir un número entre 1 y 31");
		}if (mes<=0 || mes>12){
			throw new IllegalArgumentException("Debes introducir un número entre 1 y 12");
		}if (año<0){
			throw new IllegalArgumentException("Debes introducir un número mayor que 0");
		}else		
			
		return dia+" de "+mes+" de "+año;
	}
}
