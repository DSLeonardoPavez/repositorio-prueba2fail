
package cl.duoc.models;
import java.time.LocalDate;

public class VehiculoAereo extends Pasajero {
    
    public VehiculoAereo(String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(id, 
                nombre,
                fechanacimiento,
                rut, 
                telefono, 
                email,
                vetado);
    }
    
    
    
    
            
    
    
}
