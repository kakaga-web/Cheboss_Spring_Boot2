package _Java8_exercices.ChebossException;

import java.io.*;

public class chebossCheckedException {
    public static void main(String[] args) {

        openFile("C:\\Users\\Fatima et yassine\\IdeaProjects\\Cheboss_Spring_Boot2_\\src\\main\\java\\_Java8_exercices\\inputCheboss.txt");

    }


    public static void openFile(String name) {
        try {
            FileInputStream f = new FileInputStream(name);

        } catch (FileNotFoundException e) {
            System.out.println("file no found ");
            e.printStackTrace();
        }
    }


  /*  public static void main(String[] args) throws FileNotFoundException {
        openFile("C:\\Users\\Fatima et yassine\\IdeaProjects\\Cheboss_Spring_Boot2_\\src\\main\\java\\_Java8_exercices\\inputCheboss.txt");
    }

    public static void openFile(String name) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(name);
    }*/
}