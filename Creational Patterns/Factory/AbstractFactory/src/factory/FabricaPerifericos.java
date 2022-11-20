package factory;

import mouse.Mouse;
import teclado.Teclado;

public interface FabricaPerifericos {

    public Mouse criarMouse();
    public Teclado criarTeclado();

}
