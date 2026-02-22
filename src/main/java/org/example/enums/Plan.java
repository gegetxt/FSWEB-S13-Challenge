package org.example.enums;

public enum Plan {

    BASIC("Basic Plan", 100),
    PREMIUM("Premium Plan", 200),
    GOLD("Gold Plan", 300);

    private String name;
    private int price;   // 🔥 double değil int

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {   // 🔥 double değil int
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " TL";
    }
}