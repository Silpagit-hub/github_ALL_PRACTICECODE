package com.threadPractice;

public class WaitImplementation {
    public static void main(String[] args) throws InterruptedException {
        CalculateTotal calculateTotal=new CalculateTotal();
        calculateTotal.start();
        synchronized (calculateTotal){
            calculateTotal.wait();
        System.out.println("this is the total "+calculateTotal.total);
        }
    }
}

class CalculateTotal extends Thread{
    int total = 0;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                total = total + 100;
            }
            notify();
        }
    }
}
