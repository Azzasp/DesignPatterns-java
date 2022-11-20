import factory.FabricaTransporte;
import transporte.Caminhao;
import transporte.Transporte;

public class Main {

    public static void main(String[] args) {
        FabricaTransporte fabricaTransporte = new FabricaTransporte();

        Transporte caminhao = fabricaTransporte.fabricarTransporte(1);
        Transporte navio = fabricaTransporte.fabricarTransporte(2);
        

        navio.entregar();
        caminhao.entregar();
    }
}