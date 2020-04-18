package _Java8_exercices.Collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample_Generics {
    public static String version = System.getProperty("java.version");

    public static <T> void fetchAll(T[] z) {
        System.out.println("aList members fetch by for loop below " + "\n");
        for (T b : z) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        String[] aList = {"a", "b","fff"};
        aList[2] = "eee";

        fetchAll(aList);
        System.out.println("\n Now please type a number or a string ! ");
        Scanner sc = new Scanner(System.in);
        String Chebossinput = sc.nextLine();
        System.out.println("Proudly made by Cheboss while typing scanner unput **" +
                Chebossinput + "** at Java version  " + version + "\n");
        System.out.println(Arrays.toString(aList));

    }
}
