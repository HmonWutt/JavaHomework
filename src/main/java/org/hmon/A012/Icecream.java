package org.hmon.A012;

public enum Icecream {
    BLUEBERRY("blue berry", 15),
    VANILLA("vanilla", 10),
    BANANA("banana", 9),
    CHOCOLATE("chocolate",12);
    private String flavour;
    private int price;
    Icecream(String flavour, int price){
        this.flavour = flavour;
        this.price = price;
    }
    public void getFlavour(){
        System.out.print(this.flavour+ "-flavoured ice cream");
    }
    public void getPrice(){
        System.out.println(" costs "+this.price +"dollars");
    }
}

