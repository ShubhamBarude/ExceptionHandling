package ExceptionHandling;

import java.util.Scanner;
class YoungerException extends RuntimeException //this class is taking for declaring Exception
{
    YoungerException(String msg)     //  are taking parametric constructor
    {
        super(msg);               // "your are not eligible for voting" this message is print inside super  message
    }
}
public class Voting
{
    public static void main(String[] args) {
        int age;                          // age is taking from user
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age:");
        age=sc.nextInt();
try {
    if (age >= 18) {      //it is age is under 18 so throw message will  execute inside exception
        throw new YoungerException("you are  eligible for voting");

    } else {
        System.out.println("your are not  eligible for voting");
    }
}
catch (YoungerException e)
{
    System.out.println("it is catch block");
    e.printStackTrace();
        }

        System.out.println("hello");
    }
}
