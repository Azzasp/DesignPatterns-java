package factory;

import mouse.Mouse;
import mouse.MouseGamer;
import teclado.Teclado;
import teclado.TecladoGamer;

public class PerifericosGamer implements FabricaPerifericos{

    @Override
    public Mouse criarMouse() {
        return new MouseGamer();
    }

    @Override
    public Teclado criarTeclado() {
        return new TecladoGamer();
    }
}
