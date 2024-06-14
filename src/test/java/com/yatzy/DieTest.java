package com.yatzy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.RepeatedTest;

public class DieTest {

    @RepeatedTest(value = 100)
    void diceValueShouldBeBetween1And6() {
        Die dice = new DieImpl();

        assertThat(dice.getValue()).isBetween(1, 6);
    }

}
