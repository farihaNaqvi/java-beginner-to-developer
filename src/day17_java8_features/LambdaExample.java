package day17_java8_features;

public class LambdaExample {

    public static void main(String[] args) {

        // Without lambda
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running without lambda");
            }
        };

        r1.run();

        // With lambda
        Runnable r2 = () -> System.out.println("Running with lambda");

        r2.run();
    }
}