package com.ideaman924;

public class HealthyBurger extends Hamburger {
    private int shrimp;
    private int avocado;

    public HealthyBurger(int meat, int price) {
        super("Brown Rye Bread Roll", meat, price);
    }

    public int getShrimp() {
        return shrimp;
    }

    public void setShrimp(int shrimp) {
        this.shrimp = shrimp;
    }

    public int getAvocado() {
        return avocado;
    }

    public void setAvocado(int avocado) {
        this.avocado = avocado;
    }
}
