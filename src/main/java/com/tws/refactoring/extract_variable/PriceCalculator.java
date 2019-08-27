package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    public double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        double maxNum = Math.max(0, quantity - 500) * itemPrice * 0.05;
        double minNum = Math.min(quantity * itemPrice * 0.1, 100.0);
        double result = quantity * itemPrice - maxNum +minNum;

        return result;
    }
}
