package ir.ac.kntu.compiler;

public class FatalException extends RuntimeException{
    public FatalException(String message) {
        super(message);
        System.err.println("Fatal Error!");
    }
}
