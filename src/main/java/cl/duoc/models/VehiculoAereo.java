
package cl.duoc.models;
import java.time.LocalDate;

public class VehiculoAereo {
    
     /*Avion es Extend de VehiculoAereo}
    Tiene S.nombre
    I.ValorVuelo
    boolean.VueloDisponible
    date.FechaVuelo
    String Estado
    */
    
    private String nombre;
    private int valorvuelo;
    private boolean vuelodisponible;
    private LocalDate fechavelo;
    private String estado;

    public VehiculoAereo(String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
        this.nombre = nombre;
        this.valorvuelo = valorvuelo;
        this.vuelodisponible = vuelodisponible;
        this.fechavelo = fechavelo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorvuelo() {
        return valorvuelo;
    }

    public void setValorvuelo(int valorvuelo) {
        this.valorvuelo = valorvuelo;
    }

    public boolean isVuelodisponible() {
        return vuelodisponible;
    }

    public void setVuelodisponible(boolean vuelodisponible) {
        this.vuelodisponible = vuelodisponible;
    }

    public LocalDate getFechavelo() {
        return fechavelo;
    }

    public void setFechavelo(LocalDate fechavelo) {
        this.fechavelo = fechavelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
            
    
    
}
