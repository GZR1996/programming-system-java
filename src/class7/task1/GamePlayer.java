package class7.task1;

import java.util.Random;

public class GamePlayer {

	private static Random random = new Random();
	
    public Symbol getSymbol() {
        Symbol symbol = Symbol.values()[random.nextInt(Symbol.values().length)];
        return symbol;
    }
}
