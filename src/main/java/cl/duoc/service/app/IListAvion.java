
package cl.duoc.service.app;

import cl.duoc.models.Avion;
import java.util.ArrayList;


public class IListAvion {
    private ArrayList<Avion> Listar;

    public IListAvion(){
        Listar = new ArrayList();
    }
    public IListAvion(ArrayList<Avion> Listar){
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

    public Avion ObtenerAvion(int id){
        return this.Listar.get(id);
    }
}

