package designpatterns.singleton;

public class Filho extends Familia{

    private String nome;
    private SingletonCarro carro;

    public Filho(String nome) {
        this.nome = nome + " " + super.getNome();
    }

    @Override
    public String dirigir() {
        return this.nome + "está dirigindo";
    }
}
