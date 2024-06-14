package com.yatzy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Game {


    public static List<Dice> play() {
        List dice =  new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dice.add(new Dice());
        }
        return dice;
    }
}
