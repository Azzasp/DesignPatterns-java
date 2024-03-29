package designpatterns.singleton;

public class Pai extends Familia{

    private String nome;
    private SingletonCarro carro = SingletonCarro.getCarro();

    public SingletonCarro getCarro() {
        return carro;
    }

    public Pai(String nome) {
        this.nome = nome + " " + super.getNome();
    }

    @Override
    public String dirigir() {
        return this.nome + " est� dirigindo";
    }
}
