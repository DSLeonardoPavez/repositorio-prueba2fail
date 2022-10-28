
package cl.duoc.service.app;

import cl.duoc.models.Avion;
import java.util.ArrayList;


public class IListarAvion {
    private ArrayList<Avion> Listar;

    public IListarAvion(){
        Listar = new ArrayList();
    }
    public IListarAvion(ArrayList<Avion> Listar){
        this.Listar = Listar;
    }

    public ArrayList<Avion> getLista() {
        return Listar;
    }

    public void setLista(ArrayList<Avion> Listar) {
        this.Listar = Listar;
    }

    public void AgregarAvion(Avion av){
        this.Listar.add(av);
    }

    public void EliminarAvion(Avion av){
        this.Listar.remove(av);
    }

    public void ReemplazarAvion(int id, Avion av){
        this.Listar.set(id, av);
    }

    public Avion ObtenerInstagram(int id){
        return this.Listar.get(id);
    }
}

