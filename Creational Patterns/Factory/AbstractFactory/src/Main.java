import factory.FabricaPerifericos;
import factory.PerifericosErgonomicos;
import factory.PerifericosGamer;
import mouse.Mouse;
import teclado.Teclado;

public class Main {

    public static void main(String[] args) {
        //Criando as f�bricas
        FabricaPerifericos perifericosGamer = new PerifericosGamer();
        FabricaPerifericos perifericosErgonomicos = new PerifericosErgonomicos();

        //Criando nossos perif�ricos gamer
        Mouse mouseGamer = perifericosGamer.criarMouse();
        Teclado tecladoGamer = perifericosGamer.criarTeclado();

        //Criando nossos perif�ricos ergonomicos
        Mouse mouseErgonomico = perifericosErgonomicos.criarMouse();
        Teclado tecladoErgonomico = perifericosErgonomicos.criarTeclado();

        //Testando respectivos perif�ricos
        mouseGamer.clicar();
        mouseErgonomico.clicar();

        tecladoGamer.teclar();
        tecladoErgonomico.teclar();
    }
}