package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        super.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0;
    }
}
