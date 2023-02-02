/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author noral
 */
public class Repartidor {

	public final static int Max_Repartos = 5;
	/*Un valor en porcentaje que indica la autonomía en kilómetros restante en su patinete de reparto. 
	Un patinete completamente cargado tiene una autonomía de 30Km 
	(valor fijo para todos los repartidores).*/
	public final static int Max_Autonomia = 30;

	//Un nombre del repartidor (basta con manejar una cadena).
	private String nombreRepartidor;

	public String getNombreRepartidor() {
		return nombreRepartidor;
	}
	//*******************************************
	private Turno turno;

	public Turno getTurno() {
		return turno;
	}
	
	/* Un número de repartos efectuados, 
	que se va incrementando a lo largo de la jornada, 
	hasta alcanzar el número máximo de repartos que puede 
	hacer un repartidor, que es de 5 repartos (valor fijo para todos los repartidores).*/
	private int repartosRealizados;

	public int getrepartosRealizados() {
		return repartosRealizados;
	}
	/*Debe exponer únicamente getter públicos para cada una de las propiedades. 
	No se deben implementar setter públicos, ya que la modificación de las propiedades 
	se realizará a través de métodos específicos 
	(es decir, no se permitirá modificar las propiedades a través de setters).*/
	private int kmAutonomia;

	public int getkmAutonomia() {
		return kmAutonomia;
	}
	/*Crea un constructor que inicialice las propiedades 
	del repartidor con valores predeterminados.*/
	public Repartidor() {
		this.kmAutonomia = Max_Autonomia;
		this.repartosRealizados = 0;
		this.turno = Turno.Diurno;
	}

	/*Crea otro constructor que reciba un parámetro por cada 
	propiedad del repartidor e inicialice cada propiedad con 
	el valor del parámetro correspondiente.*/
	public Repartidor(String nombreRepartidor, int kmAutonomia, int repartosRealizados, Turno turno) {
		this.nombreRepartidor = nombreRepartidor;
		this.kmAutonomia = kmAutonomia;
		this.repartosRealizados = repartosRealizados;
		this.turno = turno;

	}

	
	/*Debe exponer un método "hacerReparto". El método es un procedimiento 
	(no devuelve un valor al código llamador) 
	y debe recibir como parámetro la distancia estimada (en kilómetros) del reparto a efectuar.
	
	Al invocar a este método, se debe:
	• Incrementar el número de repartos efectuados.
	• Decrementar la autonomía del patinete (de acuerdo al parámetro recibido).*/
	
	public void hacerReparto(double distanciaReparto) {
		if (this.getrepartosRealizados() >= Max_Repartos)
			throw new IllegalStateException("Se ha superado el número máximo de repartos diarios");

		if (this.getkmAutonomia() < distanciaReparto)
			throw new IllegalStateException("No hay autonomía suficiente para realizar el reparto");

		if (this.getrepartosRealizados() < Max_Repartos && distanciaReparto <= this.getkmAutonomia()) {
			this.kmAutonomia -= distanciaReparto;
			this.repartosRealizados++;
		}
	}

	/*Debe exponer un método "monitorizar", que muestre gráficamente 
	(en la medida que una aplicación de consola puede hacerlo) 
una indicación de los repartos efectuados y la autonomía disponible.*/
	
	public void monitorizar() {
		System.out.println("Repartidor: " + this.getNombreRepartidor());
		System.out.println("Turno: " + this.getTurno());

		System.out.println("Autonomía ");

		for (int i = 0; i < this.getkmAutonomia(); i++) {
			System.out.println("*");
		}
		for (int i = this.getkmAutonomia(); i < Max_Autonomia; i++) {
			System.out.print(".");
		}
		System.out.println();

		System.out.print("Repartos realizados:");
		for (int i = 0; i < getrepartosRealizados(); i++) {
			System.out.print("*");
		}
		for (int i = this.getrepartosRealizados(); i < Max_Repartos; i++) {
			System.out.print(".");
		}

		System.out.println();
		System.out.println();
	}
}
