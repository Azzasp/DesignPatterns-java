package designpatterns.singleton;

public class Mae extends Familia{

    private String nome;
    private SingletonCarro carro;

    public Mae(String nome) {
        this.nome = nome + " " + super.getNome();
    }

    public SingletonCarro getCarro() {
        return carro;
    }

    @Override
    public String dirigir() {
        return this.nome + "est� dirigindo";
    }
}
