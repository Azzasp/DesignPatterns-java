package designpatterns;

import designpatterns.singleton.Filho;
import designpatterns.singleton.Mae;
import designpatterns.singleton.Pai;

public class Main {
    public static void main(String[] args) {
        Pai pai = new Pai("Roberto");
        Mae mae = new Mae("Marta");
        Filho filho = new Filho("Roberto Junior");

        pai.setNome();
    }
}