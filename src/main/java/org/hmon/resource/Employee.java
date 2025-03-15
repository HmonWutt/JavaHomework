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
        return String.format("%s (%s)",name,work);
    }
    public String work(){
        return String.format("%s is working on a report in %s.\n",name,work);
    }

}
