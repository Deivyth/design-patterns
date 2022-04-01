package com.kreitek.pets.domain;


public class Logger {

    private static volatile Logger instance = null;
    public int counter = 0;

    public void debug(String command){
        counter++;
        System.out.println("[debug]["+counter+"] - "+command);
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized(Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}
