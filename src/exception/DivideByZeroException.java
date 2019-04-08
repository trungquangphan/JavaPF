package exception;

public class DivideByZeroException extends Exception{
    public DivideByZeroException(){
        super("error divided by zero");
    }

    public DivideByZeroException(String message){
        super(message);
    }

}
