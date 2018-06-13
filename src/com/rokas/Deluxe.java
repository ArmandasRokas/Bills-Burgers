package com.rokas;

public class Deluxe extends Hamburger {
    public Deluxe(String bread, double price, double priceChips, double priceDrinks){
        super("Deluxe", bread, "Beef",price);
        super.addAddition(5, priceChips);
        super.addAddition(6, priceDrinks);

    }
    public Deluxe(String bread, double price){
        super("Deluxe", bread, "Beef",price);
        super.addAddition(5, -1);
        super.addAddition(6, -1);

    }

    public boolean addAddition(int num, double price){

        System.out.printf("No addition is allowed to this type of hamburger\n");

        return false;
    }
}
