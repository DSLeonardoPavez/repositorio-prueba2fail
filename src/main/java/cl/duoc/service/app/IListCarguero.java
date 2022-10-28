
package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import java.util.ArrayList;


public class IListCarguero {
    private ArrayList<Carguero> Listar;

    public IListCarguero(){
        Listar = new ArrayList();
    }
    public IListCarguero(ArrayList<Carguero> Listar){
        this.Listar = Listar;
    }

    public ArrayList<Carguero> getLista() {
        return Listar;
    }

    public void setLista(ArrayList<Carguero> Listar) {
        this.Listar = Listar;
    }

    public void AgregarCarguero(Carguero ca){
        this.Listar.add(ca);
    }

    public void EliminarCarguero(Carguero ca){
        this.Listar.remove(ca);
    }

    public void ReemplazarCarguero(int id, Carguero ca){
        this.Listar.set(id, ca);
    }

    public Carguero ObtenerCarguero(int id){
        return this.Listar.get(id);
    }
}
