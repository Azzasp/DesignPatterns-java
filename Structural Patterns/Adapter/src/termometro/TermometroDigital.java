package termometro;

import models.Pessoa;

public class TermometroDigital {
    public double medirTemperaturaFahrenheit(Pessoa pessoa){
        return pessoa.getTemp();
    }
}
