package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMultipleCatchExample
{
//    package ExceptionPackage;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;


        public static void main(String[] args) {
            // Creates an array of character
            char[] array = new char[100];



            try {

               // System.exit(0);
                // Creates a reader using the FileReader
                FileReader input = new FileReader("input23423.txt");

                // Reads characters
                input.read(array);
                System.out.println("Data in the file: ");
                System.out.println(array);

                // Closes the reader

            } catch (FileNotFoundException e) {
                System.out.println("Exception block");
                 System.out.println(e);
                //e.getStackTrace();
              //  throw new RuntimeException("ygdunc");
            } catch (IOException e) {

                e.getStackTrace();

                //timeout exception -> payment processing is taking a lot time
            } catch (Exception e) {
                e.getStackTrace();
            } finally {
                //input.close();

               System.out.println("This is always going to execute irrespective of exception occurrence");
               // throw new RuntimeException("ygdunc");

            }


            //finally -> whether exceptions occurs or not will get always executed
            //why we need finally block?  -> resource close
            // multiple exception in single catch
            // try with resource in java

        }
    }

