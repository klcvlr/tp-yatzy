package com.yatzy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Yatzy {

    @Test
    void shouldReceiveFiveDice(){
        List<Dice> result = Game.play();

        Assertions.assertThat(result).hasSize(5);
    }


}