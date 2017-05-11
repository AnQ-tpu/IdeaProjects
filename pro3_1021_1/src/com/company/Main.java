package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Settings settings = Settings.getInstance(args[0]);
        settings.show();

        settings.setVolume(settings.getVolume() + 10);
        settings.setBrightness(settings.getBrightness() + 10);
        settings.setFps(settings.getFps() + 10);
        settings.show();
        settings.save();
    }
}
