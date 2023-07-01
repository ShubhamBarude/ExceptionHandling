package ExceptionHandling;

public class FinallyTest1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 20;
            int c;
            c = b / a;
            System.out.println("i am in try block:" + c);
        } catch (Exception e) {
            System.out.println("i am in catch block:");
        } finally {
            System.out.println("i am in finally block:");
        }
    }

}