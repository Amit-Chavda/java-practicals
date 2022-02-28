public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException aException) {
            System.err.println("Inside ArithmeticException : " + aException.getMessage());
        } catch (Exception e) {
            System.err.println("Insisde generic Exception : " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
