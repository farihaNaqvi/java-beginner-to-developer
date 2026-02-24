package day16_multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running using extends Thread");
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();  // starts new thread
    }
}