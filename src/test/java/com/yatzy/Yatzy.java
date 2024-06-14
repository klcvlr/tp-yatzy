package com.yatzy;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Yatzy {

    @Test
    void shouldReceiveFiveDice() {
        List<Die> result = Game.play();

        Assertions.assertThat(result).hasSize(5);
    }

}