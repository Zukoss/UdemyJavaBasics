package kThread;

public class ThreadTimeMeter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; true; i++){
            try {
                Thread.sleep(1000); } catch (InterruptedException e) { }
            System.out.println("Program (thread) working in seconds: " + i);
        }
    }
}
