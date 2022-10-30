
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

    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre Avion: ").append(super.getNombre());
        sb.append("\nValor Vuelo: ").append(super.getValorvuelo());
        sb.append("\nFecha Vuelo: ").append(super.getFechavelo());        
        sb.append("\nEstado Avion: ").append(super.getEstado());
        return sb.toString();
    }
    
}
