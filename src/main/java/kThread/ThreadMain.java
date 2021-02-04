package kThread;

public class ThreadMain {
    public static void main(String[] args) {
//        Thread thread = new Thread(new ThreadTimeMeter()) {
//        };
//        thread.start();

        Thread threadFirst = new Thread(new ThreadFirst());
        Thread threadSecond = new Thread(new ThreadSecond());

        threadFirst.start();
        threadSecond.start();
    }
}