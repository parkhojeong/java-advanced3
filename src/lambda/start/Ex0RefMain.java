package lambda.start;

public class Ex0RefMain {
    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }

    private static void hello(String str) {
        System.out.println("== start ==");
        System.out.println(str);
        System.out.println("== end ==");
    }
}
