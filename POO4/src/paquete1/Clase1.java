//Modificadores de acceso.
package paquete1;

/**
 *
 * @author noral
 */
public class Clase1 {
	/*Si dejamos <int atributo1;> podemos acceder 
	desde cualquier clase dentro de un mismo paquete.*/
	
	/*Al poner public delante <public int atributo1;> 
	podemos acceder desde cualquier clase ubicada en paquetes diferentes. */
	
	/*Y si ponemos private <private int atributo1;> solo podremos acceder
	desde la misma clase. */
	public int atributo1;
}
