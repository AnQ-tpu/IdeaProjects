package com.company;

import java.io.*;
import java.net.*;

public class Server extends Thread {
    Socket s;

    Server(Socket s){
        this.s = s;
    }
    public void run(){
        InputStream is = null;
        try{
            is = s.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String packet = reader.readLine();

            System.out.println(packet);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
