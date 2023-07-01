package ExceptionHandling;

public class test01
{
    public static void main(String[] args) {
        int a=20;
        int b=0;
       // int sum=a/b;
//        test01 obj=new test01();
//        System.out.println("enter div:"+sum);
try{
    test01 obj=new test01();
    int sum=a/b;
    System.out.println("enter div:"+sum);

}
catch(Exception e)
{
    System.out.println("you can't divide by 0");
}
    }
}
