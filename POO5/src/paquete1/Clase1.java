//Encapsulamiento y métodos accesores (Setters y Getters).
package paquete1;

/**
 *
 * @author noral
 */
public class Clase1 {

	private int edad;
	private String nombre;

	//Setter: establecemos la edad.
	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Getter: mostramos la edad.
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
