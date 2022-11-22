import eletronicos.Smartphone;
import eletronicos.Tablet;

public class Main {
    public static void main(String[] args) {

        //Objetos a serem clonados
        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();

        //adicionando valores aos atributos do objetos
        smartphone.setTela("Oled");
        smartphone.setTamanhoEmCm(14);

        tablet.setTela("LCD");
        tablet.setTamanhoEmCm(30);


        //Clonagem
        
    }
}