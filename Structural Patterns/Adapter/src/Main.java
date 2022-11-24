import models.EstadoFisico;
import models.Pessoa;
import termometro.AdapterFahrenheit;
import termometro.TermometroDigital;
import termometro.TermometroMercurio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> listaPessoa = Arrays.asList((
                new Pessoa("Pedro Erick", 178, 36.0)),
                new Pessoa("Roberto", 183, 38.0),
                new Pessoa("Carlos", 175, 38.5),
                new Pessoa("Martha", 173, 36.5)
        );



        System.out.println("Medindo com Termometro Digital \n");

        for(Pessoa p : listaPessoa) System.out.println(
                p.getNome() + " | medindo: "+
                new AdapterFahrenheit()
                .medirTemperaturaCelsius(p)+
                " | estado fisico: " +
                p.getEstadoFisico() + " "
                +(p.getEstadoFisico().equals(EstadoFisico.DOENTE) ?
                p.getEnfermidade() : ""

                ));

        System.out.println("Medindo com Termometro Mercurio \n");

        for(Pessoa p : listaPessoa) System.out.println(
                p.getNome() + " | medindo: "+
                new TermometroMercurio()
                .medirTemperaturaCelsius(p)+
                " | estado fisico: " +
                p.getEstadoFisico() + " "
                + (p.getEstadoFisico().equals(EstadoFisico.DOENTE) ?
                p.getEnfermidade() : ""

                ));


    }
}