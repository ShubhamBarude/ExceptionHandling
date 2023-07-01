package ExceptionHandling;

public class ThrowsThrow
{
    void ab()
    {
        System.out.println("enter a 1 method");
    }

}
class b{
    void bb()throws NullPointerException
    {
        ThrowsThrow b=null;
        b.ab();
        System.out.println("enter 2 method :");
    }

}
     class c extends ThrowsThrow{
    void cb() {
        try {
            b A = new b();
            A.bb();

        }
        catch(NullPointerException e){
            System.out.println("exception handle:");

        }
        System.out.println("lst sout");
    }

    public static void main(String[] args) {
c obj=new c();
obj.cb();
    }
}