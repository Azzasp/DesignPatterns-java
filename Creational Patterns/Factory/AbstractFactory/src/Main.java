import factory.FabricaPerifericos;
import factory.PerifericosErgonomicos;
import factory.PerifericosGamer;
import mouse.Mouse;
import teclado.Teclado;

public class Main {

    public static void main(String[] args) {
        //Criando as fábricas
        FabricaPerifericos perifericosGamer = new PerifericosGamer();
        FabricaPerifericos perifericosErgonomicos = new PerifericosErgonomicos();

        //Criando nossos periféricos gamer
        Mouse mouseGamer = perifericosGamer.criarMouse();
        Teclado tecladoGamer = perifericosGamer.criarTeclado();

        //Criando nossos periféricos ergonomicos
        Mouse mouseErgonomico = perifericosErgonomicos.criarMouse();
        Teclado tecladoErgonomico = perifericosErgonomicos.criarTeclado();

        //Testando respectivos periféricos
        mouseGamer.clicar();
        mouseErgonomico.clicar();

        tecladoGamer.teclar();
        tecladoErgonomico.teclar();
    }
}