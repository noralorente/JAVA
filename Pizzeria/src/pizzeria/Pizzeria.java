
package pizzeria;

public class Pizzeria {

    public static void main(String[] args) {
   
        Repartidor rp= new Repartidor ("Jesus", Turnos.matutino);
        
        rp.hacerReparto(10);
                        
        System.out.println("El repartidor "+rp.GetNombre()+" ha hecho:");
        System.out.println("Repartos: "+rp.GetNrepartos());
        System.out.println("Kms: "+rp.GetNrepartos());
        System.out.println("Autonomía patinete: "+rp.GetAutonomia_rest());
        System.out.println("Tiene turno: "+rp.GetTurno());
        System.out.println("========== ESTADISTICAS ===========");
       // Llama a metodo estadística
        rp.monitorizar();
    }
    
}
