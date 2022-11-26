package models.exceptionhandle;

public class OSNotFound extends RuntimeException{

    @Override
    public String getMessage() {
        return "OS not found.";
    }
}
