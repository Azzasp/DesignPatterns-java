package factory;

import mouse.Mouse;
import mouse.MouseErgonomico;
import teclado.Teclado;
import teclado.TecladoErgonomico;

public class PerifericosErgonomicos implements FabricaPerifericos{
    @Override
    public Mouse criarMouse() {
        return new MouseErgonomico();
    }

    @Override
    public Teclado criarTeclado() {
        return new TecladoErgonomico();
    }
}
