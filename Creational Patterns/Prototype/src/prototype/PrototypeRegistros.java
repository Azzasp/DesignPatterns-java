package prototype;


import java.util.ArrayList;

public class PrototypeRegistros {

    ArrayList<Prototype> listaObjetosClonados = new ArrayList<>();

    public boolean addClone(Prototype prototype){
        listaObjetosClonados.add(prototype);
        return true;
    }

}
