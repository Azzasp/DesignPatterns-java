package designpatterns.singleton;

public class SingletonCarro {

    private String modelo;
    private String placa;
    private static SingletonCarro carro;

    private SingletonCarro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public static SingletonCarro getCarro(){
        if(carro == null) return new SingletonCarro("HB20s", "JKL0305");
        return carro;
    }
}
