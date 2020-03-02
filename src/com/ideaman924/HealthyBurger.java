package com.ideaman924;

public class HealthyBurger extends Hamburger {
    private int shrimp = 0;
    private int avocado = 0;

    private final int PRICE_SHRIMP = 700; // in cents
    private final int PRICE_AVOCADO = 350; // in cents

    public HealthyBurger(int meat, int price) {
        super("Brown Rye Bread Roll", meat, price);
    }

    @Override
    public void getAdditionInformation() {
        super.getAdditionInformation();
        System.out.println("Shrimp: " + shrimp + " * $" + (double) PRICE_SHRIMP / 100 + " = $" + (double) shrimp * PRICE_SHRIMP / 100);
        System.out.println("Avocado: " + avocado + " * $" + (double) PRICE_AVOCADO / 100 + " = $" + (double) avocado * PRICE_AVOCADO / 100);
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

    @Override
    public int getPrice() {
        return super.getPrice() + shrimp * PRICE_SHRIMP + avocado * PRICE_AVOCADO;
    }
}
