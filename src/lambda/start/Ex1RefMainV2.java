package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMainV2 {
    public static void main(String[] args) {
        Procedure hello = new Procedure() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        };
        hello(hello);
        hello(procedure);
    }

    private static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("time elapsed: " + (endNs - startNs) + " ns");
    }

}
