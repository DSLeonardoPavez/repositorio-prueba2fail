/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.time.LocalDate;

/**
 *
 * @author Leo
 */
public class Avioneta extends VehiculoAereo{
    
    public Avioneta(String nombre, int valorvuelo, boolean vuelodisponible, LocalDate fechavelo, String estado) {
        super(nombre,
                valorvuelo, 
                vuelodisponible,
                fechavelo,
                estado);
    }
    
}
