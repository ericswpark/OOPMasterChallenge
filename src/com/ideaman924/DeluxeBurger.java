package com.ideaman924;

public class DeluxeBurger extends Hamburger {
    // Chips and drinks included

    private final int PRICE_CHIPS = 200;
    private final int PRICE_DRINKS = 100;

    public DeluxeBurger(String breadRollType, int meat, int price) {
        super(breadRollType, meat, price);
    }

    @Override
    public void getAdditionInformation() {
        System.out.println("Chips: 1 * $" + (double) PRICE_CHIPS / 100 + " = $" + (double) PRICE_CHIPS / 100);
        System.out.println("Drinks: 1 * $" + (double) PRICE_DRINKS / 100 + " = $" + (double) PRICE_DRINKS / 100);
    }

    @Override
    public void setLettuce(int lettuce) {
        warnUser();
        super.setLettuce(0);
    }

    @Override
    public void setTomato(int tomato) {
        warnUser();
        super.setTomato(0);
    }

    @Override
    public void setCarrot(int carrot) {
        warnUser();
        super.setCarrot(0);
    }

    @Override
    public void setCheese(int cheese) {
        warnUser();
        super.setCheese(0);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + PRICE_CHIPS + PRICE_DRINKS;
    }

    private void warnUser() {
        System.out.println("Deluxe burger - additions not allowed");
        System.out.println("Setting value to 0");
    }
}
