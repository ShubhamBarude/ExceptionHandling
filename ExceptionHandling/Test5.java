package ExceptionHandling;

import java.util.Scanner;

public class Test5
{
    Test5(int a,int b)
    {
        System.out.println("it is constructor"+(b/a));
    }
   // int a=10;
    public static void main(String[] args) {
        Test5 obj=new Test5(0,100);
    }
}
//class Test05 extends Test5{
//    public static void main(String[] args) {
//        Test05 obj=new Test05();
//        System.out.println(obj.add());
//        System.out.println(Scanner );
//    }
//}