package models.exceptionhandle;

public class IncompatibleSystemException extends RuntimeException{

    @Override
    public String getMessage() {
        return " is Incompatible with this System: ";
    }
}
