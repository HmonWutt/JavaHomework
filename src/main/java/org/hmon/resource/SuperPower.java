package org.hmon.resource;

public class SuperPower {
    private final String type;
    private final String description;
    public SuperPower(String type, String description){
        this.type = type;
        this.description = description;
    }
    public String usePower(){
        return String.format("%s - %s\n",this.getType(),this.getDescription());
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
