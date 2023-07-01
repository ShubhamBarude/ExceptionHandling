package ExceptionHandling;

public class finallyTest2
{
    public static void main(String[] args) {
        try{
            int a=20;
            int b=0;
            int c;
            c=a/b;
            System.out.println("i am in try block:"+c);
        }
        catch(Exception e)
        {
            System.out.println("we a can't divide by 0 :");
        }
        finally{
            System.out.println("i am in finally block : ");
        }
    }
}
