package study;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadStudy {

    public static void main(String[] args){
        new Thread01().start();
        new Thread(() -> {
            System.out.println("Thread");
        }
        ).start();
        Thread02 thread02 = new Thread02();
        Thread thread = new Thread(thread02);
        thread.start();
        Executors.newCachedThreadPool().execute(new Thread02());
    }
}

class Thread01 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread01");
    }
}
class Thread02 implements  Runnable{

    @Override
    public void run() {
        System.out.println("Thread02");
    }
}
