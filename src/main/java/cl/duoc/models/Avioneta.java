
package cl.duoc.models;

import java.time.LocalDate;


public class Avioneta extends VehiculoAereo{
    
    public Avioneta(String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
        super(nombre,
                valorvuelo, 
                vuelodisponible,
                fechavelo,
                estado);
    }
    
}
