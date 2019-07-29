package com.company;

public class LimitException extends Exception {
    double remainingAmount;
    public void getRemainingAmount() {
    }


    LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;

    }
}
