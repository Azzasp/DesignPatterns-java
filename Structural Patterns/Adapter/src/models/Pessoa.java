package models;

public class Pessoa {
    private String nome;
    private int alturaCm;
    private EstadoFisico estadoFisico;

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

    public void setEstadoFisico(EstadoFisico estadoFisico) {
        this.estadoFisico = estadoFisico;
    }
}
