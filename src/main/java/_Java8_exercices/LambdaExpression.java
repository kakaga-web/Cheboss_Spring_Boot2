package _Java8_exercices;

public class LambdaExpression {
    interface Drawable { // Main interface
        void draw(int i);
    }

    // Classic interface implementation
    public static class Idraw implements Drawable { // boilerplate
        @Override
        public void draw(int i) {
            System.out.println("Drawing by classical implementation of interface " + i);
        }
    }

    public static void main(String[] args) {
        // Classic call
        Idraw intfc = new Idraw(); // boilerplate


        // implementation of drawable interface using anonymous class without lambda expression
        Drawable withoutLambda = new Drawable() {
            public void draw(int i) {
                System.out.println("Drawing by Anonymous implementation without lambda " + i);
            }
        };

        // implementation of drawable interface using anonymous class with lambda expression
        Drawable withLambda = (ff) -> System.out.println("Drawing by Anonymous implementation with lambda " + ff);


        intfc.draw(40); // boilerplate
        withoutLambda.draw(8);
        withLambda.draw(10);
    }
}

