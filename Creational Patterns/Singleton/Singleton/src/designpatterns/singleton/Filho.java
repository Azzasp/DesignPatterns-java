package designpatterns.singleton;

public class Filho extends Familia{

    private String nome;
    private SingletonCarro carro = SingletonCarro.getCarro();

    public Filho(String nome) {
        this.nome = nome + " " + super.getNome();
    }

    public SingletonCarro getCarro() {
        return carro;
    }

    @Override
    public String dirigir() {
        return this.nome + " está dirigindo";
    }
}
