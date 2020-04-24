package _Java8_exercices.ChebossException;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); // read the input

        System.out.println("enter the dividend number  : "); //
        String dividend = sc1.nextLine(); // or nextInt() to avoid parseInt() method
        System.out.println("enter the divisor number  : ");
        String divisor = sc2.nextLine();

        try { // this is optional, the thrown exception is unchecked
            System.out.println("the remainder is " + divideTheseNumbers(parseInt(dividend), parseInt(divisor)));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("toString exception method  --> " + e.toString());
            System.out.println("getMessage exception Method --> " + e.getMessage());
            try {
                throw new ArithmeticException("Cheboss created an exception that devids by 0 / by zero");
                // Comment this try catch block and the last two statements after finally won't appear !!!!!
            } catch (ArithmeticException d) {
                d.printStackTrace();
            }
            // the uncaught Arithmetic exception throw new will prevent the statements after finally from appearing,
            // because since the exception isn't handled
            // it's is thrown to the default JVM handler ( so basically it's just finally who will appear
            // and then BAM! the program is abruptly terminated ( statements after finally won't be shown )
        } finally {
            System.out.println("I'm finally Statement");
        }
        System.out.println("I'm here because the catch block didn't raise an unhandled exception ( or there is no exception at all ");
        System.out.println("I'm outside all !!!");
    }

    public static int divideTheseNumbers(int dividendArg, int divisorArg) { // Unchecked exception
        return dividendArg / divisorArg; // Unchecked Exception
    }

}

