package kThread;

public class ThreadFirst implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("I'll be first - it's me! First Thread: " + i);
        }
        System.out.println("Finish! The First Thread report.");
    }
}
