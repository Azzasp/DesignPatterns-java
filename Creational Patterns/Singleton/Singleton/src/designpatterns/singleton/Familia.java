package designpatterns.singleton;

public abstract class Familia {

    private String nome = "Da Silva";

    public String getNome() {
        return nome;
    }


    public abstract String dirigir();
}
