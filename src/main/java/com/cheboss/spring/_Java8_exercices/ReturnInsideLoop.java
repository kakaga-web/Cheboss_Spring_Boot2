package com.spring.spring._Java8_exercices;

public class ReturnInsideLoop {


    // Since return type of RR method is
    // void so this method should not return any value
    void showValues(int number) {

        for (int i = 0; i < number; i++) {
            if (i == 5) {
               return;
               // System.out.println("com.spring.spring.model.dfg");
              //  continue;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        new ReturnInsideLoop().showValues(10); // ReturnInsideLoop r = new ReturnInsideLoop();
        System.out.println("End of loop");
    }
}
