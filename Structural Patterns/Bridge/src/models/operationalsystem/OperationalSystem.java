package models.operationalsystem;

import models.programs.Program;
import models.programs.Systems;

public interface OperationalSystem {

    public Program loadProgram(Program program);
    public Systems compatibility();
    public void startUp();
    public void shutdown();

}
