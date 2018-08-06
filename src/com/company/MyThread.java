package com.company;

import java.util.Random;

public class MyThread implements Runnable {

    String name = "";
    Random value;



    public MyThread(String name){
        this.name=  name;
        this.value= new Random();
    }
    @Override
    public void run() {
        try {
            System.out.print("Tread "+ name+" is going to sleep. \n") ;
            int currentValue = value.nextInt(999);
            java.lang.Thread.sleep(currentValue);
            System.out.print("MyThread "+name+" is awake. It slept for "+currentValue +" miliseconds\n");
        }
        catch (Exception e){}
    }
}
