package com.ideaman924;

public class DeluxeBurger extends Hamburger {
    // Chips and drinks included

    public DeluxeBurger(String breadRollType, int meat, int price) {
        super(breadRollType, meat, price);
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

    private void warnUser() {
        System.out.println("Deluxe burger - additions not allowed");
        System.out.println("Setting value to 0");
    }
}
