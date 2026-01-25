package lambda.lambda1;

import lambda.Procedure;
import lambda.start.Ex1RefMain;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };

        System.out.println("procedure.getClass() = " + procedure.getClass());
        System.out.println("procedure = " + procedure);

        Procedure procedure2 = () -> System.out.println("hello lambda2");
        System.out.println("procedure2.getClass() = " + procedure2.getClass());
        System.out.println("procedure2 = " + procedure2);
    }
}
