package com.spring.spring._Java8_exercices;

import com.sun.istack.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static String version = System.getProperty("java.version");

    public static void fetchAll(@NotNull ArrayList<String> z) {
        System.out.println("aList members fetch by for loop below ( before adding a new element )" + "\n");
        for (int i = 0; i < z.size(); i++) { // for ( String s in z )
            System.out.println(z.get(i)); //   System.out.println(s)
        }
        z.add("Added element to the argument using Add function");

    }

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("Orange");
        aList.add("Apple");
        aList.add("Peach");
        aList.add("Guava");
        aList.add("Mango");

        System.out.println("Before adding the new element -> " + aList +
                "\n");

        fetchAll(aList);
        System.out.println("\nReturned list object ( after adding the new element )\t->\t" + aList);
        System.out.println("\n Now please type a number or a string ! ");
        Scanner sc = new Scanner(System.in);
        String Chebossinput = sc.nextLine();
        System.out.println("Proudly made by Cheboss while typing scanner unput **" +
                Chebossinput + "** at Java version  " + version + "\n");

    }

}



