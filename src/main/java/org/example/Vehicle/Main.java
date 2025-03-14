package org.example.Vehicle;

public class Main {
    public static void main(String[] args){
        Car toyoyaAygo = new Car("HBO123","manual",4);
        toyoyaAygo.updateMaintainanceDate("25/01/01");
        toyoyaAygo.displayDetails();
        toyoyaAygo.displayMaintenanceDate();
        Maintenance.displayMaintanenceCases();

        Car nissan = new Car("HBS234","automatic",5);
        nissan.updateMaintainanceDate("02/03/2024");
        nissan.displayDetails();
        nissan.displayMaintenanceDate();
        Maintenance.displayMaintanenceCases();

        Vehicle tank = new Vehicle("No id", "military tank");
        tank.updateMaintainanceDate("02/05/2024");
        tank.displayDetails();
        tank.displayMaintenanceDate();
        Maintenance.displayMaintanenceCases();
    }
}
