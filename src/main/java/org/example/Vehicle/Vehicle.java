package org.example.Vehicle;

public class Vehicle {
    protected String id;
    protected String type;
    protected Maintenance lastMaintained;

    public Vehicle(String id, String type){
        this.id = id;
        this.type = type;
        this.lastMaintained = new Maintenance();

    }
    public void updateMaintainanceDate(String date){
        this.lastMaintained.updateMaintenanceDate(date);
    }
    public void displayMaintenanceDate(){
        this.lastMaintained.displayLastServieDate();
    }
    public void displayDetails(){
        System.out.println("Plate number: "+id+","+"Type: "+type);
    }
}
