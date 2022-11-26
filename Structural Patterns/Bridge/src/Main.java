import models.computer.Computer;
import models.computer.Laptop;
import models.computer.Pc;
import models.operationalsystem.MacOS;
import models.operationalsystem.UbuntuOS;
import models.operationalsystem.WindowsOS;
import models.programs.IApplication;
import models.programs.Program;
import models.programs.Systems;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop("Aspire-E15", "Acer", new WindowsOS("Windows", "Microsoft", Year.of(2015)));
        Computer pc = new Pc("iMac", "Apple", new MacOS("Catalina", "Apple", Year.of(2019)));
        Computer programerLaptop = new Laptop("m15-R7", "Alienware", new UbuntuOS("Ubuntu", "Canonical", Year.of(2022)));

        Program photoshop = new Program("Photoshop", "Adobe", Year.now(), Systems.WINDOWS_OS);
        Program gimp = new Program("Gimp", "Gimp", Year.now(), Systems.UBUNTU_OS);
        Program logicPro = new Program("Logic Pro", "Apple", Year.now(), Systems.MAC_OS);

        laptop.turnOn();
        pc.turnOn();
        programerLaptop.turnOn();

        laptop.installProgram(photoshop);
        laptop.installProgram(gimp);
    }
}