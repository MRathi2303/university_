package sem_3rd.ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num = 100 / 0;  // This will throw ArithmeticException
        }
//            catch (ArithmeticException e) {
//            System.out.println("Error: Division by zero is not allowed.");
//        }
        finally {
            System.out.println("This block is always executed.");
        }
    }
}
