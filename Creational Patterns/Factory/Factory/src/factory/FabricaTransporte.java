package factory;

import transporte.Caminhao;
import transporte.Navio;
import transporte.Transporte;

public class FabricaTransporte {

    public Transporte fabricarTransporte(int i){
        if(i == 1) return new Caminhao();
        if(i == 2) return new Navio();
        return null;
    }

}
