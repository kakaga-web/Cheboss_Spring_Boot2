package _Java8_exercices.ChebossException;

import java.io.*;

public class chebossCheckedException {
    public static void main(String[] args) {

        try {
            openFile("C:\\Users\\Fatima et yassine\\IdeaProjects\\Cheboss_Spring_Boot2_\\src\\main\\java\\_Java8_exercices\\ChebossException\\inputCheboss.txt");
            System.out.println("Yes the file exists !! ");
        } catch (FileNotFoundException e) {
            System.out.println(" file not found ! ");
            e.printStackTrace();
        }

    }
// Checked exception Extends Throwable and all the other exceptions are Unchecked exception ( Runtime and Error exceptions )

    public static void openFile(String name) throws FileNotFoundException { // Checked exception
// I can put a try catch block here so i won't have to declare it in the main method ( i'll also not need throws FileNotFoundException !!
        FileInputStream f = new FileInputStream(name);

    }


  /*  public static void main(String[] args) throws FileNotFoundException {
        openFile("C:\\Users\\Fatima et yassine\\IdeaProjects\\Cheboss_Spring_Boot2_\\src\\main\\java\\_Java8_exercices\\inputCheboss.txt");
    }

    public static void openFile(String name) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(name);
    }*/
}