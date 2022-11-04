
package cl.duoc.models;

import java.time.LocalDate;


public class Pasajero {
    String id;
    private String nombre;
    private LocalDate fechanacimiento;
    private int rut;
    private int telefono;
    private String email;
    private boolean vetado;

    public Pasajero(String id, String nombre, LocalDate fechanacimiento, int rut, int telefono, String email, boolean vetado) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.rut = rut;
        this.telefono = telefono;
        this.email = email;
        this.vetado = vetado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVetado() {
        return vetado;
    }

    public void setVetado(boolean vetado) {
        this.vetado = vetado;
    }

 
    
    
}
