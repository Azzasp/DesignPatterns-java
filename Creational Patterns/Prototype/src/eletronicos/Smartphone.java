package eletronicos;

import prototype.Prototype;
import prototype.PrototypeRegistros;

public class Smartphone extends Eletronicos{

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

    public Smartphone() {
    }

    public Smartphone(Smartphone smartphone) {
        this.tela = smartphone.tela;
        this.tamanhoEmCm = smartphone.tamanhoEmCm;
    }

    @Override
    public Prototype clonar() {
        Smartphone smartphone = new Smartphone(this);
        PrototypeRegistros.getRegistros().addClone(smartphone);
        return smartphone;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "tela='" + tela + '\'' +
                ", tamanhoEmCm=" + tamanhoEmCm +
                '}';
    }
}
