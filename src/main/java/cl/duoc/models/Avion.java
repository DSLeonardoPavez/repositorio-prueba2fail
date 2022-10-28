
package cl.duoc.models;

import java.time.LocalDate;

public class Avion extends VehiculoAereo {

    public Avion(String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
       
        super(nombre, 
                valorvuelo, 
                vuelodisponible,
                fechavelo,
                estado);
    
    }

   
    
}
