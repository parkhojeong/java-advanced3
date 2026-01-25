package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = () -> System.out.println("hello sam");
        samInterface.run();


        /**
         * java: incompatible types: NotSamInterface is not a functional interface
         *     multiple non-overriding abstract methods found in interface NotSamInterface
         */
        // can't assignable
        // NotSamInterface notSamInterface = () -> System.out.println("hello sam");
    }
}
