package org.hmon.resource;

public class NormalEmployee extends Employee{
    NormalEmployee(String name, String work, int salary){
        super(name,work,salary);
    }
    @Override
    public String toString(){
        return String.format("Emp: %s",super.toString());
    }
    @Override
    public String work(){
        return String.format("Emp: %s",super.work());
    }
}
