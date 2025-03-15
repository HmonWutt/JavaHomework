package org.hmon.resource;

import java.util.ArrayList;

public class Team {
    private ArrayList<Employee> member = new ArrayList<>();
    public void add (Employee employee){
        member.add(employee);
    }
    @Override
    public String toString(){
        StringBuilder finalString = new StringBuilder();
        finalString.append("#TEAM: \n");
        for (Employee each: member) {
            String eachEmployee = String.format("%s\n", each.toString());
            finalString.append(eachEmployee);
        }
        return finalString.toString();
    }
    public String work(){
        StringBuilder working = new StringBuilder();
        for (Employee each: member){
            working.append(each.work());
        }
        return working.toString();
    }

}
