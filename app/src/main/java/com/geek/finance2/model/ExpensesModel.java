package com.geek.finance2.model;

import java.io.Serializable;

public class ExpensesModel implements Serializable {
    private final String name;
    private final int image;
    private final String amount;

    public ExpensesModel(String name, int image, String amount) {
        this.name = name;
        this.image = image;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAmount() {
        return amount;
    }
}
