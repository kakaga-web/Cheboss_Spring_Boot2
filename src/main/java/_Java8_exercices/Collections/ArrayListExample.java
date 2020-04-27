package _Java8_exercices.Collections;

import com.sun.istack.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// IMPORTANT COLLECTION FEATURE
// To declare an ArrayList, i can use ArrayList ar = new ArrayList(); -> The classical way to create an instance from an class
// Or i can benefit from the generic ( introduced in Java 5 ) and USE -> ArrayList<T> ar = new ArrayList <>();
// new ArrayList(); -> is the constructor of the ArrayList class
public class ArrayListExample {
    public static String version = System.getProperty("java.version");

    public static void fetchAll(@NotNull List<String> z) {
        System.out.println("aList members fetch by for loop below ( before adding a new element )" + "\n");
        for (int i = 0; i < z.size(); i++) { // for ( String s in z )
            System.out.println(z.get(i)); //   System.out.println(s)
        }
        z.add("Added element to the argument using Add function");

    }

    public static void main(String[] args) {
        List<String> aList = new ArrayList<>(); // ArrayList<String> aList = new ArrayList<>(); is also valid because ArrayList implements List
        // BEST PRACTICE IS : always program against Interface ! so when a new implementation of list appear, it won't cause yt
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



