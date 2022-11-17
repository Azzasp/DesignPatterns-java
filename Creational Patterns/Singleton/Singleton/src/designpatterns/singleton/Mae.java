package designpatterns.singleton;

public class Mae extends Familia{

    private String nome;
    private SingletonCarro carro;

    public Mae(String nome) {
        this.nome = nome + " " + super.getNome();
    }

    @Override
    public String dirigir() {
        return this.nome + "está dirigindo";
    }
}
