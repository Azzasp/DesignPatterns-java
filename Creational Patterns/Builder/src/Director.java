import builder.CarBuilder;
import car.Ferrari;
import car.Tucson;

public class Director {

    public void createSUV(CarBuilder builder){
        builder.setSeats(5)
                .setWindow(4)
                .setEngine("2.0l")
                .setMultimidia(false)
                .setGPS(false);
    }

    public void createSportCar(CarBuilder builder){
        builder.setSeats(2)
                .setWindow(2)
                .setEngine("V12")
                .setMultimidia(true)
                .setGPS(true);
    }

}
