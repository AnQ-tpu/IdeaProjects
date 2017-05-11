package com.company;
/**
 * Created by AnQ on 2016/12/16.
 */
public class Worker extends Thread {
    String name;
    Counter counter;

    public Worker(String name, Counter c){
        this.name= name;
        counter = c;
    }
    public void run(){
        for(int i=0; i <1000000; i++){
            counter.countUp();
            System.out.println(name + ":" + counter.getCount());
        }
    }
}
