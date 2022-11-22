import eletronicos.Smartphone;
import eletronicos.Tablet;
import prototype.PrototypeRegistros;

public class Main {
    public static void main(String[] args) {
        PrototypeRegistros prototypeRegistros = new PrototypeRegistros();
        //Objetos a serem clonados
        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();

        //adicionando valores aos atributos do objetos
        smartphone.setTela("Oled");
        smartphone.setTamanhoEmCm(14);

        tablet.setTela("LCD");
        tablet.setTamanhoEmCm(30);


        //Clonagem
        Smartphone cloneSmartphone = new Smartphone(smartphone);
        Tablet cloneTablet = new Tablet(tablet);

        //Iterando lista
        prototypeRegistros.verClones();
    }
}