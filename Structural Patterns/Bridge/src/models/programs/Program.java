package models.programs;

import models.computer.Computer;
import models.exceptionhandle.IncompatibleSystemException;

import java.time.Year;


public class Program implements IApplication {

    private String name;
    private String brand;
    private Year releaseYear;
    private Systems compatipleSystem;

    public Program() {
    }
    public Program(String name, String brand, Year releaseYear, Systems compatipleSystem) {
        this.name = name;
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.compatipleSystem = compatipleSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Systems getCompatipleSystem() {
        return compatipleSystem;
    }

    public void setCompatipleSystem(Systems compatipleSystem) {
        this.compatipleSystem = compatipleSystem;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", releaseYear=" + releaseYear +
                ", compatipleSystem=" + compatipleSystem +
                '}';
    }

    @Override
    public void open() {
        System.out.println("Verifying compatibility...\n");
        System.out.println("Opening "+this);
    }

    @Override
    public void close() {
        System.out.println("Closing "+this);
    }

    @Override
    public boolean verifyCompatibleSystem(Computer computer) {
        try{
            if(computer.getOs().compatibility() != compatipleSystem) throw new IncompatibleSystemException();
        }catch(IncompatibleSystemException e){
            System.out.println(computer+e.getMessage()+compatipleSystem);
            return false;
        }
        System.out.println("System: "+compatipleSystem+ " is compatible!");
        return true;
    }
}
