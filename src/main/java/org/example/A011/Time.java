package org.example.A011;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void print() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Unformatted time: "+now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = now.format(formatter) ;
        System.out.println("Formatted time: "+formattedTime);
    }

}