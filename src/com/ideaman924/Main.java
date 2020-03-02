package com.ideaman924;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("White", 1, 2000);
        hamburger.setCarrot(4);
        hamburger.getHamburgerInformation();

        HealthyBurger healthyBurger = new HealthyBurger(1, 2710);
        healthyBurger.setAvocado(13);
        healthyBurger.getHamburgerInformation();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Black rye bread", 1, 3900);
        deluxeBurger.setCarrot(29);
        deluxeBurger.getHamburgerInformation();
    }
}
