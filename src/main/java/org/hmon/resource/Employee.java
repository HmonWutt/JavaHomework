package org.hmon.resource;

public class Employee {
    private final String name;
    private final String work;
    private int salary;
    private static int globalEmpId = 0;
    protected int empId;
    public Employee(String name, String work, int salary){
        globalEmpId++;
        this.empId = globalEmpId;
        this.name = name;
        this.work = work;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return String.format("(%s) %s (%s)",empId,name,work);
    }
    public String work(){
        return String.format("%s is working on a report in %s.\n",name,work);
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }
}
