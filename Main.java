import lambdas.Example;

// This class demonstrates the usage of lambda expressions in Java.

public class Main {
    public static void main(String[] args) {

        // (parameters) -> expression
        Example<Integer> calculate1 = (Integer x, Integer y) -> x + y;
        System.out.println(calculate1.example(2, 2));

        // (parameters) -> { statements; }
        Example<String> calculate2 = (String x, String y) -> {
            Integer result = Integer.parseInt(x) + Integer.parseInt(y);
            return result.toString();
        };
        System.out.println(calculate2.example("2", "2"));
    }
}