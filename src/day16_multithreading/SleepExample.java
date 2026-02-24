package day16_multithreading;

public class SleepExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);

                try {
                    Thread.sleep(1000);  // 1 second delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }

        });

        thread.start();
    }
}