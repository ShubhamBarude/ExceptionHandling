package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyTest3
{
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream obj=new FileInputStream("/cd/vision_code/test50");
    }
}
