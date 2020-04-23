package _Java8_exercices;

public class StaticMethodAndFieldAcces {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            System.out.println(c1.toString()); // Without toString it's juts a reference of the new created object
            printCount();
        }
    }

    private static void printCount() {

        System.out.println("There are now " + CountTest.getInstanceCount() + " instances of the CountTest class.");
    }
}

class CountTest { // Two classes inside the main class, but one is declared public
    private static int instanceCount = 0;

    public CountTest() {
        instanceCount++;
    }

    public static int getInstanceCount() { // this static method can be called using CountTest.getInstanceCount
        return instanceCount;
    }

    @Override
    public String toString() {
        return "ToString is calculating , it's now -> " + instanceCount; // NO this because the field is a class field
    }
}