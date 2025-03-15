package org.hmon.resource;

import java.util.ArrayList;

public class SuperEmployee extends Employee {
    private ArrayList<SuperPower> powers = new ArrayList<>();
    public SuperEmployee(String name, String work){
        super(name,work,0);
    }
    public void addPower(SuperPower power){
        powers.add(power);
    }
    @Override
    public String toString(){
        StringBuilder powersString = new StringBuilder();
        String output = "";
        for (SuperPower each : powers) powersString.append(each.getType()).append(", ");
        if (!powersString.isEmpty()) output = powersString.substring(0,powersString.length()-2);
        return String.format("Sup: %s- %s", super.toString(), output);
    }
    @Override
    public String work(){
        StringBuilder addOn = new StringBuilder();
        addOn.append("Sup: ").append(super.work());
        if (!powers.isEmpty()) {
            addOn.append("   Using superpower: ");
            String emptySpace = String.format("%-21s","");
            for (int i=0; i<powers.size();i++){
                if (i==0) addOn.append(powers.get(i).usePower());
                else addOn.append(emptySpace).append(powers.get(i).usePower());
            }
        }
        return addOn.toString();
    }
}
