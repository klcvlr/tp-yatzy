package com.yatzy;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GameTest {

    @Test
    void shouldReceiveFiveDice() {
        List<Die> result = Game.play();

        assertThat(result).hasSize(5);
    }

    @ParameterizedTest
    @CsvSource(value = { "1,1,1,2,3,8", "1,5,4,2,3,15" })
    void chanceShouldSumAllDice(int die1, int die2, int die3, int die4, int die5, int scoreExpected) {
        List<Die> dice = List.of(
                new DieMock(die1),
                new DieMock(die2),
                new DieMock(die3),
                new DieMock(die4),
                new DieMock(die5));

        int score = Game.score(dice, BetEnum.CHANCE);

        assertThat(score).isEqualTo(scoreExpected);

    }

    @ParameterizedTest
    @CsvSource(value = { "1,1,1,1,1,50", "5,5,5,5,5,50" })
    void yatzyShouldReturn50WhenAllDiceAreTheSame(int die1, int die2, int die3, int die4, int die5, int scoreExpected) {
        List<Die> dice = List.of(
                new DieMock(die1),
                new DieMock(die2),
                new DieMock(die3),
                new DieMock(die4),
                new DieMock(die5));

        int score = Game.score(dice, BetEnum.YATZY);

        assertThat(score).isEqualTo(scoreExpected);
    }

    @ParameterizedTest
    @CsvSource(value = { "1,1,1,1,4,0", "2,5,5,5,5,0" })
    void yatzyShouldReturn0WhenAllDiceAreNotTheSame(int die1, int die2, int die3, int die4, int die5,
            int scoreExpected) {
        List<Die> dice = List.of(
                new DieMock(die1),
                new DieMock(die2),
                new DieMock(die3),
                new DieMock(die4),
                new DieMock(die5));

        int score = Game.score(dice, BetEnum.YATZY);

        assertThat(score).isEqualTo(scoreExpected);
    }

}