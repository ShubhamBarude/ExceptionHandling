package ExceptionHandling;

import java.util.Scanner;
class InsuficiantFundsException extends RuntimeException// InsuficiantFundsException it is user defile class
{
    InsuficiantFundsException(String msg)
    {
        super(msg);
    }
}
public class AccountB
{

    public static void main(String[] args) {
        int balance = 25000;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a amount:");
        amount = sc.nextInt();



            try {
                if (amount >= balance) {
                    throw new InsuficiantFundsException("insuficiant funds");
                } else {
                    System.out.println("successfully withdrawal");
                }
            } catch (InsuficiantFundsException e) {
                e.printStackTrace();
            }
            System.out.println("** ! Thank You ! ** ");
        }


}
