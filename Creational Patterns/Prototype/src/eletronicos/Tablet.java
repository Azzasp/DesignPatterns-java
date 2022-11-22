package eletronicos;

import prototype.Prototype;
import prototype.PrototypeRegistros;

public class Tablet extends Eletronicos{

    private String tela;
    private int tamanhoEmCm;

    //Getters and Setters
    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public int getTamanhoEmCm() {
        return tamanhoEmCm;
    }

    public void setTamanhoEmCm(int tamanhoEmCm) {
        this.tamanhoEmCm = tamanhoEmCm;
    }

    //Construtores efetuando a clonagem
    public Tablet() {
    }

    public Tablet(Tablet tablet) {

        this.tela = tablet.tela;
        this.tamanhoEmCm = tablet.tamanhoEmCm;
    }

    @Override
    public Prototype clonar() {
        Tablet tablet = new Tablet(this);
        new PrototypeRegistros().addClone(tablet);
        return tablet;
    }

}
