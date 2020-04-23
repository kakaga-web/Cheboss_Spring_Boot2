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

        try {
            System.out.println("the remainder is " + divideTheseNumbers(parseInt(dividend), parseInt(divisor)));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("toString exception method  --> " + e.toString());
            System.out.println("getMessage exception Method --> " + e.getMessage());
        } finally {
            System.out.println("I'm finally Statement");
        }
        System.out.println("I'm outside all !!!");
    }

    public static int divideTheseNumbers(int dividendArg, int divisorArg) {
        return dividendArg / divisorArg; // Unchecked Exception
    }
}