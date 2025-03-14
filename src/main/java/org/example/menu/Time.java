package org.example.menu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Time {
    public static void print() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Unformatted time: "+now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter) ;
        System.out.println("Formatted time: "+formattedTime);
    }

}