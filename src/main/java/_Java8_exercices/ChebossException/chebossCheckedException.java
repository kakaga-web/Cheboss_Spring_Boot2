package _Java8_exercices.ChebossException;

import java.io.*;
// These checked exceptions are thrown mainly when dealing with external resources !!
public class chebossCheckedException {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Fatima et yassine\\IdeaProjects\\Cheboss_Spring_Boot2_\\src\\main\\java\\_Java8_exercices\\ChebossException\\inputCheboss.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // Java 7 closes the file for us ( no need for finally )
            String sCurrentLine;
            System.out.println(" The whole text read from the file is listed below \n ");
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            System.out.println("\n file reading is finished ");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
            throw new FileNotFoundException("\n no such file is present in the directory Mr cheboss") ;
        }
// Checked exception Extends Throwable and all the other exceptions are Unchecked exception ( Runtime and Error exceptions )

    }
}