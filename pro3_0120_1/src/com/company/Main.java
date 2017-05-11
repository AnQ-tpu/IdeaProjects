package com.company;

import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Socket s = null;
        try{
            ServerSocket ss = new ServerSocket(18418);
//            s = ss.accept();
//
//            InputStream is = s.getInputStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//
//            String packet = reader.readLine();
//            System.out.println(packet);
            while(true){
                s = ss.accept();
                Server server = new Server(s);
                Thread th = new Thread(server);
                th.start();
            }
        }catch(Exception e){

        }
    }
}
