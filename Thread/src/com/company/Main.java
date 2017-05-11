package com.company;

public class Main {

    public static void main(String[] args) {

        Counter c = new Counter();

	    Worker w1 = new Worker("worker1", c);
        Worker w2 = new Worker("worker2", c);

        w1.start();
        w2.start();

        System.out.println("End of Main");
    }
}
