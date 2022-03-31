package com.kreitek.pets.domain;

import java.util.List;

public class Logger {

    private int count = 0;

    public void debug(String command){
        count++;
        System.out.println("[debug]["+count+"] - "+command);
    }
}
