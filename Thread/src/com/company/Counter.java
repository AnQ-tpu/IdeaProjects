package com.company;

/**
 * Created by AnQ on 2016/12/16.
 */
public class Counter {

    private int count;

    public synchronized void countUp(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
