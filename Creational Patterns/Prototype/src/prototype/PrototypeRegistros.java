package prototype;


import java.util.ArrayList;

public class PrototypeRegistros {

    ArrayList<Prototype> listaObjetosClonados = new ArrayList<>();
    static PrototypeRegistros registros;
    private PrototypeRegistros() {

    }

    public static PrototypeRegistros getRegistros(){
        if(registros == null) return new PrototypeRegistros();
        return registros;
    }
    public boolean addClone(Prototype prototype){
        listaObjetosClonados.add(prototype);
        return true;
    }

    public void verClones(){
        for(Prototype p : listaObjetosClonados) System.out.println(p);
    }

}
