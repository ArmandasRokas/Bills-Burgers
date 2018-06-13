package com.rokas;

public class Addition {
    private double price;
    private String name;

    public Addition(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Carrots extends  Addition {
    public Carrots() {
        super(1.00, "Carrots");
    }
    public Carrots(double price) {
        super(price, "Carrots");
    }
}
class Onions extends Addition {
    public Onions (){ super(1.10, "Onions" ); }
    public Onions(double price) { super(price, "Onions"); }
}
class Tomato extends  Addition {
    public Tomato() {
        super(1.00, "Tomato");
    }
    public Tomato(double price) { super(price, "Tomato"); }
}
class Spinat extends Addition {
    public Spinat (){
        super(1.10, "Spinat" );
    }
    public Spinat(double price) { super(price, "Spinat"); }
}
class Chips extends Addition {
    public Chips (){ super(2.10, "Chips" ); }
    public Chips(double price) { super(price, "Chips"); }
}
class Drinks extends Addition {
    public Drinks (){
        super(2.50, "Drinks" );
    }
    public Drinks(double price) { super(price, "Drinks"); }
}