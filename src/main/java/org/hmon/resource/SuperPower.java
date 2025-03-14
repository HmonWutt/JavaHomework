package org.hmon.resource;

public class SuperPower {
    private final String type;
    private final String description;
    public SuperPower(String type, String description){
        this.type = type;
        this.description = description;
    }
    public String usePower(){
        return "Use power";
    }

    public String getType() {
        return type;
    }
}
