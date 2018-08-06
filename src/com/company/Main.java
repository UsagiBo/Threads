package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread one = new Thread(new MyThread("1"));
        Thread two= new Thread(new MyThread("2"));
        Thread three = new Thread(new MyThread("3"));
        Thread four = new Thread(new MyThread("4"));
        Thread five = new Thread(new MyThread("5"));
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
    }
}
