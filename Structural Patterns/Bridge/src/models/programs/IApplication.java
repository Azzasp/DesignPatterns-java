package models.programs;

import models.computer.Computer;

public interface IApplication {

    public void open();
    public void close();
    public boolean verifyCompatibleSystem(Computer computer);
}

