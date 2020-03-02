package com.ideaman924;

public class Hamburger {
    private String breadRollType;
    private int meat;
    private int price; // in cents
    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int cheese = 0;
    private String name;

    private final int PRICE_LETTUCE = 200; // in cents
    private final int PRICE_TOMATO = 300; // in cents
    private final int PRICE_CARROT = 175; // in cents
    private final int PRICE_CHEESE = 275; // in cents

    public Hamburger(String breadRollType, int meat, int price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void getHamburgerInformation() {
        System.out.println("Base price of hamburger: $" + (double) price / 100);
        System.out.println("---------");
        System.out.println("Additions");
        System.out.println("---------");
        getAdditionInformation();
        System.out.println("Total price: $" + (double) getPrice() / 100);
    }

    public void getAdditionInformation() {
        System.out.println("Lettuce: " + lettuce + " * $" + (double) PRICE_LETTUCE / 100 + " = $" + (double) lettuce * PRICE_LETTUCE / 100);
        System.out.println("Tomato: " + tomato + " * $" + (double) PRICE_TOMATO / 100 + " = $" + (double) tomato * PRICE_TOMATO / 100);
        System.out.println("Carrot: " + carrot + " * $" + (double) PRICE_CARROT / 100 + " = $" + (double) carrot * PRICE_CARROT / 100);
        System.out.println("Cheese: " + cheese + " * $" + (double) PRICE_CHEESE / 100 + " = $" + (double) cheese * PRICE_CHEESE / 100);
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public int getPrice() {
        return price + lettuce * PRICE_LETTUCE + tomato * PRICE_TOMATO + carrot * PRICE_CARROT + cheese * PRICE_CHEESE;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
