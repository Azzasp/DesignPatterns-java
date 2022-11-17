package designpatterns;

import designpatterns.singleton.Filho;
import designpatterns.singleton.Mae;
import designpatterns.singleton.Pai;

public class Main {
    public static void main(String[] args) {
        Pai pai = new Pai("Roberto");
        Mae mae = new Mae("Marta");
        Filho filho = new Filho("Roberto Junior");


        //family test drive
        System.out.println(pai.dirigir());
        System.out.println(mae.dirigir());
        System.out.println(filho.dirigir());

        //proving Singleton

        System.out.println("\nShould be the exact same car!\n");

        System.out.println(pai.getCarro());
        System.out.println(mae.getCarro());
        System.out.println(filho.getCarro());
    }
}