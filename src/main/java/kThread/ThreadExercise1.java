package kThread;

public class ThreadExercise1 {
    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadTimeMeter() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000); } catch (InterruptedException e) { }
                System.out.println("This information was writen out from anonymous class and thread.");
            }
        });
        thread.start();
    }
}

// Drugi sposób bez przypisania do obiektu!
// new Thread(new Runnable() {
// @Override
// public void run() {
//        System.out.println("This information was writen out from anonymous class and thread.");
//        }
//        }).start();
