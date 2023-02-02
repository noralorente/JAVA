/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author noral
 */
public class Triangulo {
	
	private double Base;
	private double Altura;

	public double getBase() {
		return Base;
	}

	public void setBase(double Base) {
		this.Base = Base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double Altura) {
		this.Altura = Altura;
	}

	
	
	public Triangulo() {
	}

	public Triangulo(double Base, double Altura) {
		this.Base = Base;
		this.Altura = Altura;
	}
	
	public double Area(){
		return (Base*Altura)/2;
	}
}
