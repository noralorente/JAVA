/* Ciclo do while

do{
    Instrucciones;
}while(condición);
*/

package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author noral
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1, contador;
        
        System.out.println("Digite la cantidad de términos: ");
        contador = entrada.nextInt();
        
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);
    }
}
