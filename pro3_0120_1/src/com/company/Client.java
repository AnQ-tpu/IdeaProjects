package com.company;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String args[]){
        try{
            Socket s = new Socket();
            s.connect(new InetSocketAddress("133.55.109.173", 18418));
            OutputStream os = s.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
            writer.write("I'm very very tired!!!!!");
            writer.flush();
        }catch(Exception e){

        }
    }
}
