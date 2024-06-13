package com.yatzy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class Yatzy {

    @Test
    void allDicesInAThrowShouldBeBetween1And6(){
        List<Dice> result = play();
    }


}