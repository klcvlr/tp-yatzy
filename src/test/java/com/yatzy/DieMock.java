package com.yatzy;

public class DieMock implements Die {

    private int value;

    public DieMock(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

}
