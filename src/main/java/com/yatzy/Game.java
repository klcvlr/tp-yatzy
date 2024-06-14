package com.yatzy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static List<Die> play() {
        List<Die> dice = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dice.add(new DieImpl());
        }
        return dice;
    }

    public static int score(List<Die> dice, BetEnum bet) {
        int score = switch (bet) {
            case CHANCE -> dice.stream().mapToInt(Die::getValue).sum();
            case YATZY -> dice.stream().mapToInt(Die::getValue).distinct().count() == 1 ? 50 : 0;
        };

        return score;

    }
}
