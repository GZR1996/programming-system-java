package class7.task1;

public enum Symbol {
    ROCK, PAPER, SCISSORS;

    public GameResult getResult(Symbol symbol) {
        if (this == symbol) {
            return GameResult.DRAW;
        }

        switch (this) {
            case ROCK:
                if (symbol == Symbol.PAPER) {
                    return GameResult.LOSE;
                } else {
                    return GameResult.WIN;
                }
            case PAPER:
                if (symbol == Symbol.SCISSORS) {
                    return GameResult.LOSE;
                } else {
                    return GameResult.WIN;
                }
            case SCISSORS:
                if (symbol == Symbol.ROCK) {
                    return GameResult.LOSE;
                } else {
                    return GameResult.WIN;
                }
        }
        return GameResult.WIN;
    }

    @Override
    public String toString() {
        if (this == ROCK) {
            return "ROCK";
        } else if (this == SCISSORS) {
            return "SCISSORS";
        } else if (this == PAPER) {
            return "PAPER";
        }
        return "UNKNOW";
    }
}
