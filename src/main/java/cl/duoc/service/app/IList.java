package cl.duoc.service.app;

import java.util.ArrayList;

public interface IList {
    
    public ArrayList<String> mostrarTodo();
    
    public String Buscar(int id);
    
    public void Agregar(String elemento);
}

