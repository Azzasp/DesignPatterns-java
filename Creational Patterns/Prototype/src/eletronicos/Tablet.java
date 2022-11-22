package eletronicos;

import prototype.Prototype;

public class Tablet extends Eletronicos{

    private String tela;
    private int tamanhoEmCm;

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

    @Override
    public Prototype clonar() {
        return null;
    }

}
