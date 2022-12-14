package models.enfermidades;

import models.EstadoFisico;

public class Gripe implements IEnfermidades{
    private final String nome = "Gripe";
    private boolean isGripado;
    private static final double temp = 38.0;

    public Gripe(boolean isGripado) {
        this.isGripado = isGripado;
    }

    @Override
    public String toString() {
        return "Gripe{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public EstadoFisico getEnfermidade() {
        if(isGripado) return EstadoFisico.DOENTE;
        return EstadoFisico.NORMAL;
    }

    public boolean isGripado() {
        return isGripado;
    }

    public void setGripado(boolean gripado) {
        isGripado = gripado;
    }

    public static double getTemp() {
        return temp;
    }
}
