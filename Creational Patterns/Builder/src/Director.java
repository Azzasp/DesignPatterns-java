import builder.CarBuilder;
import car.Ferrari;
import car.Tucson;

public class Director {

    public CarBuilder createSUV(CarBuilder builder){
        Tucson.TucsonBuilder tucsonBuilder = new Tucson.TucsonBuilder();
        tucsonBuilder.setSeats(5)
                .setWindow(4)
                .setEngine("2.0l")
                .setMultimidia(false)
                .setGPS(false);

        builder = (CarBuilder) tucsonBuilder.build();
        return builder;
    }

    public CarBuilder createSportCar(CarBuilder builder){
        Ferrari.FerrariBuilder ferrariBuilder = new Ferrari.FerrariBuilder();
        ferrariBuilder.setSeats(2)
                .setWindow(2)
                .setEngine("V12")
                .setMultimidia(true)
                .setGPS(true);

        builder = (CarBuilder) ferrariBuilder.build();
        return builder;
    }

}
