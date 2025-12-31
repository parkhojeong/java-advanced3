package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void main(String[] args) {
        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });
    }
    
    private static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("time elapsed: " + (endNs - startNs) + " ns");
    }

}
