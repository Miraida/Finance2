package com.geek.finance2.model;

import java.io.Serializable;

public class RVModel implements Serializable {
private final String title;
private final int image;

    public RVModel(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}

