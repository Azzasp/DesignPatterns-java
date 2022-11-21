package car;

import builder.CarBuilder;

public class Ferrari {

    private String engine;
    private int seats;
    private int window;
    private boolean multimidia;
    private boolean GPS;

    private Ferrari(String engine, int seats, int window, boolean multimidia, boolean GPS) {
        this.engine = engine;
        this.seats = seats;
        this.window = window;
        this.multimidia = multimidia;
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Ferrari{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", window=" + window +
                ", multimidia=" + multimidia +
                ", GPS=" + GPS +
                '}';
    }

    public static class FerrariBuilder implements CarBuilder {
        private String engine;
        private int seats;
        private int window;
        private boolean multimidia;
        private boolean GPS;
        private static Ferrari ferrari;


        @Override
        public CarBuilder setSeats(int num) {
            this.seats = num;
            return this;
        }

        @Override
        public CarBuilder setWindow(int num) {
            this.window = num;
            return this;
        }

        @Override
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public CarBuilder setMultimidia(boolean multimidia) {
            this.multimidia = multimidia;
            return this;
        }

        @Override
        public CarBuilder setGPS(boolean gps) {
            this.GPS = gps;
            return this;
        }

        //troquei getResult para build, assim fica mais intuitivo
        public Ferrari build(){
            return new Ferrari(engine,seats,window,multimidia,GPS);
        }
    }
}
