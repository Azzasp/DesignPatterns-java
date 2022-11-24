package models;

import models.enfermidades.Covid;
import models.enfermidades.Gripe;
import models.enfermidades.IEnfermidades;

public class Pessoa {
    private String nome;
    private int alturaCm;
    private EstadoFisico estadoFisico;
    private double temp;
    private IEnfermidades enfermidade;

    public Pessoa(String nome, int alturaCm, double temp) {
        this.nome = nome;
        this.alturaCm = alturaCm;
        setTemp(temp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    public EstadoFisico getEstadoFisico() {
        return estadoFisico;
    }

    public double getTemp(){
        return temp;
    }

    private void setTemp(double temp) {
        if(temp == 38.0) {
            enfermidade = new Gripe(true);
            estadoFisico = enfermidade.getEnfermidade();
        }
        else if(temp == 38.5){
            enfermidade = new Covid(true);
            estadoFisico = enfermidade.getEnfermidade();
        }else estadoFisico = EstadoFisico.NORMAL;
        this.temp = temp;
    }

    public IEnfermidades getEnfermidade() {
        return enfermidade;
    }
}
