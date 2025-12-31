package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMain {
    public static void main(String[] args) {
        hello(new Sum());
        hello(new Dice());
    }


    private static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("time elapsed: " + (endNs - startNs) + " ns");
    }

    static class Sum implements Procedure {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    static class Dice implements Procedure {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }
}
