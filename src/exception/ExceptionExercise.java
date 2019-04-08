package exception;

public class ExceptionExercise {

    public static void main(String[] args) {
        int x = 0;
        try{
            double result = divide(100, x);
        }catch (Exception e){
            e.printStackTrace();
        }

//        try {
//            double result = divide(100, x);
//            System.out.println("result = "+result);
//        }catch (DivideByZeroException ex){
//            System.out.println("Please enter x again");
//        }catch (Exception e){
//            System.err.println(e.getMessage() + ". Detail: ");
//            e.printStackTrace();
//        }
    }


    private static double divide(int a, int x) throws DivideByZeroException {
        double result=0;
        checkException(x);

        result = a/x;
        return result;
    }

    private static void checkException(int x) throws DivideByZeroException {
        if (x == 0){
            throw new DivideByZeroException("Can not divided by zero");
        }
    }
}
