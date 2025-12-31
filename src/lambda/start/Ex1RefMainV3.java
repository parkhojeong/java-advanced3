package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void main(String[] args) {
        hello(new Procedure() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
        hello(new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        });
    }
    
    private static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("time elapsed: " + (endNs - startNs) + " ns");
    }

}
