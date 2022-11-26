package models.operationalsystem;

public interface OperationalSystem {

    public Program loadProgram(Program program);
    public void startUp();
    public void shutdown();

}
