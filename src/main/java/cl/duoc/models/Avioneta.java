
package cl.duoc.models;

import java.time.LocalDate;


public class Avioneta extends VehiculoAereo{

    private boolean ultrasonico;
    private boolean listoparavolar;
    private LocalDate fechaultimovuelo;
    private int horasvoladas;

    public Avioneta(boolean ultrasonico, boolean listoparavolar, LocalDate fechaultimovuelo, int horasvoladas, String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        super(id,
                nombre, 
                fechanacimiento,
                rut, 
                telefono, 
                email,
                vetado);
        
    }

    public Avioneta(boolean ultrasonico, boolean listoparavolar, LocalDate fechaultimovuelo, int horasvoladas, String origen, String destino, LocalDate fecha, String piloto, String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
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
        this.ultrasonico = ultrasonico;
        this.listoparavolar = listoparavolar;
        this.fechaultimovuelo = fechaultimovuelo;
        this.horasvoladas = horasvoladas;
    }

    public boolean isUltrasonico() {
        return ultrasonico;
    }

    public void setUltrasonico(boolean ultrasonico) {
        this.ultrasonico = ultrasonico;
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Avioneta nro"+id 
                +"ultra sonico: " + ultrasonico 
                +"listo para volar: " + listoparavolar 
                +"fecha ultimo vuelo: " + fechaultimovuelo 
                +"horas voladas: " + horasvoladas;
    }
    
    
    
}
