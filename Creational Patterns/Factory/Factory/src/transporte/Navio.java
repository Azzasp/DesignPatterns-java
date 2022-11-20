package transporte;

public class Navio implements Transporte{

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean entregar() {
        System.out.println("Produto Entregue por: "+this.nome);
        return false;
    }
}
