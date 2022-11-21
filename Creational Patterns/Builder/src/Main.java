import builder.CarBuilder;
import car.Ferrari;
import car.Tucson;

public class Main {

    public static void main(String[] args) {
        Ferrari.FerrariBuilder ferrariBuilder = new Ferrari.FerrariBuilder();
        Tucson.TucsonBuilder tucsonBuilder = new Tucson.TucsonBuilder();

        Director director = new Director();


        director.createSUV(tucsonBuilder);
        Tucson tucson = tucsonBuilder.build();
        System.out.println(tucson);

        director.createSportCar(ferrariBuilder);
        Ferrari ferrari = ferrariBuilder.build();
        System.out.println(ferrari);
    }
}