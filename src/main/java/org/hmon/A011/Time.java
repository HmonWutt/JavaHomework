package org.hmon.A011;

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
    public static int getDay(){
        return LocalDateTime.now().getDayOfMonth();

    }
    public static String getMonth(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM"));
    }
    public static int getYear(){
        return LocalDateTime.now().getYear();
    }

}