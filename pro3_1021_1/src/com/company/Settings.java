package com.company;


import java.io.*;

//設定に関するクラス
public class Settings {
    //Settingsのインスタンスを生成
    private static Settings instance;
    //ファイル名
    private String filename;

    //音量の値
    private int volume;
    //明るさ
    private int brightness;
    //フレームレート
    private int fps;

    //コンストラクタ
    private Settings(String filename){
        this.filename = filename;
        load();
    }

    //値の読み取り
    private void load(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
            String item;
            while((item = br.readLine()) != null){
                String[] items = item.split("=");
                if(items[0].equals("volume")) this.volume = Integer.parseInt(items[1]);
                else if(items[0].equals("brightness")) this.brightness = Integer.parseInt(items[1]);
                else if(items[0].equals("fps")) this.fps = Integer.parseInt(items[1]);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }

    //値の保存
    public void save(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
            bw.write("volume=" + volume);
            bw.newLine();
            bw.write("brightness=" + brightness);
            bw.newLine();
            bw.write("fps=" + fps);
            bw.newLine();
            bw.flush();
            bw.close();
            System.out.println("設定を保存しました．");
        }catch(IOException e){
            System.out.println(e);
        }
    }

    //Settingsインスタンスの取得
    public static Settings getInstance(String filename){
        if(instance == null){
            instance = new Settings(filename);
        }
        return Settings.instance;
    }

    //音量の設定
    public void setVolume(int volume){
        this.volume = volume;
    }

    //音量の取得
    public int getVolume(){
        return volume;
    }

    //明るさの設定
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }

    //明るさの取得
    public int getBrightness(){
        return brightness;
    }

    //フレームレートの設定
    public void setFps(int fps){
        this.fps = fps;
    }

    //フレームレートの取得
    public int getFps(){
        return fps;
    }
    //設定一覧表示
    public void show(){
        System.out.println("volume= " + volume);
        System.out.println("brightness= " + brightness);
        System.out.println("fps= " + fps);
        System.out.println("===============================");
    }
}
