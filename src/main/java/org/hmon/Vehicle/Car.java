package org.hmon.Vehicle;

public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String id, String type, int numberOfDoors){
        super(id,type);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("number of doors:"+numberOfDoors);
    }

}
