package models.operationalsystem;

import models.programs.Program;
import models.programs.Systems;

import java.time.Year;

public class WindowsOS implements OperationalSystem{
    private String name;
    private String brand;
    private Year releaseYear;
    private boolean isOn;

    public WindowsOS(String name, String brand, Year releaseYear) {
        this.name = name;
        this.brand = brand;
        this.releaseYear = releaseYear;
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

    @Override
    public Program loadProgram(Program program) {
        program.open();
        return program;
    }

    @Override
    public Systems compatibility() {
        return Systems.WINDOWS_OS;
    }

    @Override
    public void startUp() {
        System.out.println("Starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down...");
    }
}
