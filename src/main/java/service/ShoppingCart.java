package service;

import model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            total += foods[i].getAmount() * foods[i].getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            double discountedPrice = foods[i].getPrice() * (1 - foods[i].getDiscount() / 100);
            total += foods[i].getAmount() * discountedPrice;
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                total += foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return total;
    }
}
