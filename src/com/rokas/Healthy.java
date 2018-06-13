package com.rokas;

public class Healthy extends Hamburger {
    Addition addition5;
    Addition addition6;

    public Healthy(double price){
        super("Healthy", "Brown rye bread roll",null,price);

    }

    @Override
    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice(); // gets Total price from basic hamburger and addittions 1-4
        if (addition5 != null){
            totalPrice += addition5.getPrice();
        }
        if (addition6 != null){
            totalPrice += addition6.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void showAdditionalsAndPrice() {
        super.showAdditionalsAndPrice();
        if (addition5 != null){
            System.out.println(addition5.getName() + " " + addition5.getPrice());
        }
        if (addition6 != null){
            System.out.println(addition6.getName() + " " + addition6.getPrice());
        }
    }

    public boolean addAddition(int num, double price) {
        boolean isAdded = super.addAddition(num,price);
        if (isAdded){
            return true;
        }
        if (addition5 == null){
            if (price > 0) addition5 = whichAddition(num, price);
            else addition5= whichAddition(num);
            return true;

        }
        if (addition6 == null){
            if (price > 0) addition6 = whichAddition(num, price);
            else addition6 = whichAddition(num);
            return true;
        }
        System.out.println("No more additions can be added");
        return false;
    }


}
