package org.hmon.A011;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Avatar {
    public static void print(){
        Path path = Paths.get("avatar.txt");
       // System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try{
            List<String> lines = Files.readAllLines(path) ;
            for(String string:lines){
                System.out.println(string);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
