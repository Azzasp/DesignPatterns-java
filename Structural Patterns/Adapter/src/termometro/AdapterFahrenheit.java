package termometro;

import models.Pessoa;

public class AdapterFahrenheit extends TermometroDigital implements ITermometro{
    //Adapter de classe
    @Override
    public double medirTemperaturaCelsius(Pessoa pessoa) {
        return super.medirTemperaturaFahrenheit(pessoa);
    }

    /*
    Caso fizessemos um adapter de objeto, a classe TermometroDigital
    não seria uma extensão da Classe Adapter se tornaria um objeto
    e utilizariamos os métodos deste objeto.
    segue o exemplo a baixo;


    public class AdapterFahrenheit implements ITermometro{
    TermometroDigital termometroDigital = new TermometroDigital();

        @Override
        public double medirTemperaturaCelsius(Pessoa pessoa) {
            return termometroDigital.medirTemperaturaFahrenheit(pessoa);
        }
    }
     */
}
