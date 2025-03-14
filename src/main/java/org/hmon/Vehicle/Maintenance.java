package org.hmon.Vehicle;

public class Maintenance {
    private String lastServiceDate ;
    private static int maintainenceCases;
    public Maintenance(){
        maintainenceCases++;
    }

    public void displayLastServieDate(){
        System.out.println(lastServiceDate);
    }
    public void updateMaintenanceDate(String date){
        this.lastServiceDate = date;
    }
    public static void displayMaintanenceCases(){
        System.out.println("Vehicles maintained by us: "+maintainenceCases);
    }

}
