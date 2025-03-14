package org.hmon.resource;

import java.util.ArrayList;

public class Team {
    private ArrayList<Employee> member = new ArrayList<>();
    public void add (Employee employee){
        System.out.println("add employee: "+employee.toString());
    }
    @Override
    public String toString(){
        System.out.println("Overrride toString");
        return "Override toString";
    }
    public void work(){
        System.out.println("team work");
    }

}
