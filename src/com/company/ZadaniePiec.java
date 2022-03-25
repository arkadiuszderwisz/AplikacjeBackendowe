package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;

public class ZadaniePiec {
    public static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Czas globalny: " + formatter.format(date));


        LocalTime time = LocalTime.now();
        System.out.println("Czas lokalny: " + time);
    }
}
