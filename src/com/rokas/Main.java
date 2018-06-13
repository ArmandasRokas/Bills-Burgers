package com.rokas;

import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {
        Hamburger healthy = new Healthy(10.00);
        healthy.addAddition(2, -1);
        healthy.addAddition(2, -1);
        healthy.addAddition(2, 3);
        healthy.addAddition(3, -1);
        healthy.addAddition(1, 4);
        healthy.addAddition(1, 3);
        healthy.addAddition(1, -1);
        healthy.showAdditionalsAndPrice();
     //   System.out.println("Total price: " + df2.format(healthy.getTotalPrice()));
        System.out.println(healthy.getTotalPrice());
        System.out.println(healthy.getPrice());

        Hamburger deluxe = new Deluxe("white", 50.00);
        deluxe.addAddition(2, -1);
        deluxe.showAdditionalsAndPrice();
    }
}
