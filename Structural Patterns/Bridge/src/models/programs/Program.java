package models.programs;

import java.time.Year;


public class Program {

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
}
