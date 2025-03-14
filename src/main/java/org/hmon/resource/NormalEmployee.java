package org.hmon.resource;

public class NormalEmployee extends Employee{
    NormalEmployee(String name, String work, int salary){
        super(name,work,salary);
    }
    @Override
    public String work(){
        return "normal employee Overrides employes work()";
    }
}
