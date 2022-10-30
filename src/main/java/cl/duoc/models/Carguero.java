
package cl.duoc.models;

import java.time.LocalDate;

public class Carguero extends VehiculoAereo{
    
    private int cantidadpeso;
    
    public Carguero(String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
        super(nombre, 
                valorvuelo, 
                vuelodisponible, 
                fechavelo, 
                estado);
    }

    public Carguero(int cantidadpeso, String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
        super(nombre, valorvuelo, vuelodisponible, fechavelo, estado);
        this.cantidadpeso = cantidadpeso;
    }

    public int getCantidadpeso() {
        return cantidadpeso;
    }

    public void setCantidadpeso(int cantidadpeso) {
        this.cantidadpeso = cantidadpeso;
    }
    
       @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre Avion: ").append(super.getNombre());
        sb.append("\nValor Vuelo: ").append(super.getValorvuelo());
        sb.append("\nFecha Vuelo: ").append(super.getFechavelo());        
        sb.append("\nEstado Avion: ").append(super.getEstado());
        sb.append("\nCantidad de Peso: ").append(this.getCantidadpeso());
        
        return sb.toString();
    }
    
    
}
