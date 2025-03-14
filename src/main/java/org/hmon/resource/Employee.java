package org.hmon.resource;

public class Employee {
    private final String name;
    private final String work;
    private int salary;
    public Employee(String name, String work, int salary){
        this.name = name;
        this.work = work;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Override to string Employee";
    }
    public String work(){
        return "Employee work";
    }
}
