package _Java8_exercices;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        System.out.println("hello there, please type something");
        Scanner sc = new Scanner(System.in);
        String typed = sc.nextLine();
        System.out.println(typed);

    }
}


