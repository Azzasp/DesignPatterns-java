package builder;

public interface CarBuilder {

    public default CarBuilder reset(){
        return null;
    }
    public CarBuilder setSeats(int num);
    public CarBuilder setWindow(int num);
    public CarBuilder setEngine(String engine);
    public CarBuilder setMultimidia(boolean multimidia);
    public CarBuilder setGPS(boolean gps);
}
