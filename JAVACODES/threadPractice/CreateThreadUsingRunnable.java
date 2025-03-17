package com.threadPractice;

public class CreateThreadUsingRunnable {

    public static void main(String[] args) {
        MyRunnable runnable= new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("Main thread started");

    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started");
    }
}