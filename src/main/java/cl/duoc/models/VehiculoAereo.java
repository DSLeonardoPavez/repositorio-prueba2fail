
package cl.duoc.models;
import java.time.LocalDate;

public class VehiculoAereo extends Pasajero {
    
    private String origen;
    private String destino;
    private LocalDate fecha;
    private String piloto;
    
    public VehiculoAereo(String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(id, 
                nombre,
                fechanacimiento,
                rut, 
                telefono, 
                email,
                vetado);
    }

    public VehiculoAereo(String origen, String destino, LocalDate fecha, String piloto, String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(id, nombre, fechanacimiento, rut, telefono, email, vetado);
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.piloto = piloto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    
    
    
            
    
    
}
