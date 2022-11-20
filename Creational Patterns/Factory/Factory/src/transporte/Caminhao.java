package transporte;

public class Caminhao implements Transporte{

    private String nome;
    private String placa;
    private String modelo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean entregar() {
        System.out.println("Produto entregue por: "+this.nome);
        return true;
    }
}
