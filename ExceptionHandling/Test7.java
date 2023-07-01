package ExceptionHandling;

class ThrowExcep
{
     static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
      //  ThrowExcep obj=new ThrowExcep();
//        obj.fun();
//       try
//       {
//           ThrowExcep obj=new ThrowExcep();
     fun();
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println("Caught in main.");
//        }
//   }
}}
