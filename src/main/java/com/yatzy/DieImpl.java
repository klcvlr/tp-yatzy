package com.yatzy;

import java.util.Random;

public class DieImpl implements Die {

    private int value;

    public DieImpl() {
        this.value = generateValue();
    }

    private int generateValue() {
        return new Random().nextInt(6 - 1) + 1;
    }

    @Override
    public int getValue() {
        return value;
    }

}
