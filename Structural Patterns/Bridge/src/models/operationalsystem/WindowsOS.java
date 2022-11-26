package models.operationalsystem;

import models.programs.Program;
import models.programs.Systems;

import java.time.Year;

public class WindowsOS implements OperationalSystem{
    private String name;
    private String brand;
    private Year releaseYear;

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

    @Override
    public Program loadProgram(Program program) {
        return null;
    }

    @Override
    public Systems compatibility() {
        return Systems.WINDOWS_OS;
    }

    @Override
    public void startUp() {

    }

    @Override
    public void shutdown() {

    }
}
