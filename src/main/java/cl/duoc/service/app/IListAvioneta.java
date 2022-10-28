/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.service.app;


import cl.duoc.models.Avioneta;
import java.util.ArrayList;


public class IListAvioneta {
    private ArrayList<Avioneta> Listar;

    public IListAvioneta(){
        Listar = new ArrayList();
    }
    public IListAvioneta(ArrayList<Avioneta> Listar){
        this.Listar = Listar;
    }

    public ArrayList<Avioneta> getLista() {
        return Listar;
    }

    public void setLista(ArrayList<Avioneta> Listar) {
        this.Listar = Listar;
    }

    public void AgregarAvioneta(Avioneta av){
        this.Listar.add(av);
    }

    public void EliminarAvioneta(Avioneta av){
        this.Listar.remove(av);
    }

    public void ReemplazarAvioneta(int id, Avioneta av){
        this.Listar.set(id, av);
    }

    public Avioneta ObtenerAvioneta(int id){
        return this.Listar.get(id);
    }
}

