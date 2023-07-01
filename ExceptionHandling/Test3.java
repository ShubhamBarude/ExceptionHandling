package ExceptionHandling;

public class Test3
{

    void add()
    {
        System.out.println("enter a addition:");
    }
}
class Test03 extends Test3
{
    void sub()
    {
        System.out.println("enter a substitution:");
    }

    public static void main(String[] args) {

        //Test03 obj= (Test03) new Test3();
try{
    Test03 obj= (Test03) new Test3(); //classcastexception
}
catch(Exception e)
{
    System.out.println("we can't take ref of child class and creating object of parent class");
}
    }
}
