package designpatterns.singleton;

public abstract class Familia {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String dirigir();
}
