package com.rokas;

public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    private double price;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, String bread, String meat, double price){
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }


    public double getPrice(){
        return price;
    }

    public double getTotalPrice(){
        double totalPrice = price;
        if (addition1 != null){
            totalPrice += addition1.getPrice();
        }
        if (addition2 != null){
            totalPrice += addition2.getPrice();
        }
        if (addition3 != null){
            totalPrice += addition3.getPrice();
        }
        if (addition4 != null){
            totalPrice += addition4.getPrice();
        }

        return totalPrice;
    }

    public void showAdditionalsAndPrice(){
        if (addition1 != null){
            System.out.println(addition1.getName() + " " + addition1.getPrice());
        }
        if (addition2 != null){
            System.out.println(addition2.getName() + " " + addition2.getPrice());
        }
        if (addition3 != null){
            System.out.println(addition3.getName() + " " + addition3.getPrice());
        }
        if (addition4 != null){
            System.out.println(addition4.getName() + " " + addition4.getPrice());
        }
    }
    public boolean addAddition(int num, double price){

        if (addition1 == null){
            if (price > 0) addition1 = whichAddition(num, price);
            else addition1= whichAddition(num);
            return true;
        }
        if (addition2 == null){
            if (price > 0) addition2 = whichAddition(num, price);
            else addition2 = whichAddition(num);
            return true;
        }
        if (addition3 == null){
            if (price > 0) addition3 = whichAddition(num, price);
            else addition3= whichAddition(num);
            return true;

        }
        if (addition4 == null){
            if (price > 0) addition4 = whichAddition(num, price);
            else addition4= whichAddition(num);
            return true;
        }
        return false;
    }


    public Addition whichAddition(int num, double price){
        switch (num){
            case 1:
                return new Carrots(price);
            case 2:
                return new Onions(price);
            case 3:
                return new Tomato(price);
            case 4:
                return new Spinat(price);
            case 5:
                return new Chips(price);
            case 6:
                return new Drinks(price);
            default:
                return null;
        }
    }
    public Addition whichAddition(int num){
        switch (num){
            case 1:
                return new Carrots();
            case 2:
                return new Onions();
            case 3:
                return new Tomato();
            case 4:
                return new Spinat();
            case 5:
                return new Chips();
            case 6:
                return new Drinks();
            default:
                return null;
        }
    }
}

