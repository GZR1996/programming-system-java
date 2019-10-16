package class7.task1;

import java.util.Random;

public class GamePlayer {

    public Symbol getSymbol() {
        Random random = new Random();
        int idx = random.nextInt(3);
        System.out.println(idx);
        Symbol symbol;
        switch (idx) {
            case 0:
                symbol = Symbol.ROCK;
            case 1:
                symbol = Symbol.SCISSORS;
            case 2:
                symbol = Symbol.PAPER;
        }
        return null;
    }
}
