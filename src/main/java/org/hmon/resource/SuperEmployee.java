package org.hmon.resource;

import java.util.ArrayList;

public class SuperEmployee extends Employee {
    private ArrayList<SuperPower> power = new ArrayList<>();
    public SuperEmployee(String name, String work){
        super(name,work,0);
    }
    @Override
    public String work(){
        return "super employeeOverrides employee work()";
    }
    public void addPower(SuperPower power){
        System.out.println(power.getType());
    }
    @Override
    public String toString(){
        return "supe employee Overrides parent class toString";
    }
}
