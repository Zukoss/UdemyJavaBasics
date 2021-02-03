package kThread;

public class ThreadSecond implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("I'll be first - it's me! Second Thread: " + i);
        }
        System.out.println("Finish! The Second Thread report.");
    }
}
