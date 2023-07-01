package ExceptionHandling;

import java.io.FileWriter;

public class Test6 {
    public static void main(String[] args) {
      //  FileWriter obj = new FileWriter("cd/feb_code/test1");//java.io.IOException
try {

    FileWriter obj = new FileWriter("cd/feb_code/test1");// when we will use Filewiter class  object
                                                                 // using that class it getting ioexception
}                                                                 //in that bracket it given a path which is a
catch(Exception e)                                               // in cd=cdrive then check feb_code folder,then
{                                                                //check test1 file.it will get exception bcz
    System.out.println("not exist");                             // in my feb_code folder there is no test1 name file
}                                                                //after that exception occur then used try catch block
    }                                                            // to handle exception
}