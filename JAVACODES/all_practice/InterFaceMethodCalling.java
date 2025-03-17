package com.all_practice;

public class InterFaceMethodCalling {
    public static void main(String[] args) {
        A1 a1=new A1();
      a1.show();
    }
}

interface I1{
    default void show(){
        System.out.println("show interface I1");
    }
}

interface I2{
    default void show(){
        System.out.println("show interface I2");
    }
}

class A1 implements I1,I2{

    @Override
    public void show() {
        I2.super.show();
    }
}