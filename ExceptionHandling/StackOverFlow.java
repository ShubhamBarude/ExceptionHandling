package ExceptionHandling;

public class StackOverFlow
{
    void m1()
    {
        StackOverFlow a=new StackOverFlow();
     //   a.m2();
        System.out.println("enter 1 method");
    }
//    void m2()
//    {
//        StackOverFlow a=new StackOverFlow();
//        a.m1();
//        System.out.println();
//    }

    public static void main(String[] args) {
        StackOverFlow a=new StackOverFlow();
        a.m1();
    }
}
