
package cl.duoc.models;

import java.time.LocalDate;

public class Carguero extends VehiculoAereo{

    private int tonelaje;
    private boolean listoparavolar;
    private LocalDate fechaultimovuelo;
    private int horasvoladas;

    public Carguero(int tonelaje, boolean listoparavolar, LocalDate fechaultimovuelo, int horasvoladas, String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(id, 
                nombre,
                fechanacimiento,
                rut, 
                telefono,
                email, 
                vetado);
       
    }

    public Carguero(int tonelaje, boolean listoparavolar, LocalDate fechaultimovuelo, int horasvoladas, String origen, String destino, LocalDate fecha, String piloto, String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(origen, 
                destino,
                fecha, 
                piloto,
                id,
                nombre, 
                fechanacimiento, 
                rut,
                telefono,
                email, 
                vetado);
        this.tonelaje = tonelaje;
        this.listoparavolar = listoparavolar;
        this.fechaultimovuelo = fechaultimovuelo;
        this.horasvoladas = horasvoladas;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    public boolean isListoparavolar() {
        return listoparavolar;
    }

    public void setListoparavolar(boolean listoparavolar) {
        this.listoparavolar = listoparavolar;
    }

    public LocalDate getFechaultimovuelo() {
        return fechaultimovuelo;
    }

    public void setFechaultimovuelo(LocalDate fechaultimovuelo) {
        this.fechaultimovuelo = fechaultimovuelo;
    }

    public int getHorasvoladas() {
        return horasvoladas;
    }

    public void setHorasvoladas(int horasvoladas) {
        this.horasvoladas = horasvoladas;
    }

    @Override
    public String toString() {
        return "Carguero nro"+id 
                +"/nCantidad Toneladas: "+ tonelaje
                +"/nlistoparavolar: "+ listoparavolar 
                +"/nfecha del ultimo vuelo: " + fechaultimovuelo 
                +"/nhoras voladas: " + horasvoladas + '}';
    }

    
    
   
    
    

    
    
    
    
   
    
}
