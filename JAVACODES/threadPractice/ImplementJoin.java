package com.threadPractice;

public class ImplementJoin {
    public static void main(String[] args) throws InterruptedException {
        SecondThread secondThread=new SecondThread();
        secondThread.start();
        System.out.println("main thread stops here ");
        secondThread.join();
        System.out.println("main Thread start after second thread");

    }
}

class SecondThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Second thread running for "+i+" time");
        }
    }
}
