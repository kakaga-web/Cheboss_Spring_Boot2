package _Java8_exercices.Collections;

public class ProgrammingForInterface {
     interface List {
        public void method1();
    }

    static class ArrayList implements List {
        @Override
        public void method1() {
            System.out.println(" hey I'm implemented inside " + this.getClass().getSimpleName() + " class");
        }
    }

    public static void main(String[] args) {
        List ar = new ArrayList(); // or simply ArrayList ar = new ArrayList();
        ar.method1();
        System.out.println("\n I'm the main method PrintLn ");
    }
}
