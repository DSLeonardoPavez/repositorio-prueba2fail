
package cl.duoc.models;


public class Pasajero {
    
    private String nombre;
    private int rut;
    private String idpasaporter;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getIdpasaporter() {
        return idpasaporter;
    }

    public void setIdpasaporter(String idpasaporter) {
        this.idpasaporter = idpasaporter;
    }

    public Pasajero(String nombre, int rut, String idpasaporter) {
        this.nombre = nombre;
        this.rut = rut;
        this.idpasaporter = idpasaporter;
    }
    
    
    
    
    
}
