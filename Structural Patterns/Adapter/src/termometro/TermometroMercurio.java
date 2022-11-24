package termometro;

import models.Pessoa;

public class TermometroMercurio implements ITermometro{
    @Override
    public double medirTemperaturaCelsius(Pessoa pessoa) {
        return pessoa.getTemp();
    }
}
