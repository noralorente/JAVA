package pizzeria;

public class Repartidor {

    private static final int MAX_REPARTOS = 5;
    private static final int AUTONOMIA_MAX = 30;

    private String nombre;
    private Turnos turno;

    private int nRepartos;
    private int autonomia_rest=AUTONOMIA_MAX;

    public Repartidor() {
    }

    public Repartidor(String nombre, Turnos turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public int GetNrepartos() {
        return this.nRepartos;
    }

    public int GetAutonomia_rest() {
        return this.autonomia_rest;
    }

    public String GetNombre() {
        return this.nombre;
    }

    public Turnos GetTurno() {
        return this.turno;
    }

    public void hacerReparto(int distancia) {

        this.nRepartos++;
        this.autonomia_rest -= distancia;
    }

    public void monitorizar() {

// Estadistica repartos
        System.out.println("Grafica de uso");
      
        for(int i=0;i<=MAX_REPARTOS;i++){
        
            System.out.print("-");
        }
        System.out.println(" ** N_Repartos maximos permitidos: "+ MAX_REPARTOS);
        
        
         for(int i=0;i<=nRepartos;i++){
        
            System.out.print("-");
        }
         System.out.println(" ** N_Repartos realizados: "+ nRepartos  );
         
         System.out.println("");
      
         
    // Estadistica Autonomia     
            
        for(int i=0;i<=AUTONOMIA_MAX;i++){
        
            System.out.print("-");
        }
        System.out.println(" ** Autonomia maxima: "+ AUTONOMIA_MAX);
        
       
         for(int i=0;i<=autonomia_rest;i++){
        
            System.out.print("-");
        }
         System.out.println(" ** Autonomia Restante: "+ autonomia_rest  );
    }

}
