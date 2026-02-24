package day16_multithreading;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}