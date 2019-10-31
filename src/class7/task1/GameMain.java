package class7.task1;

import java.util.Arrays;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        int tmp_times = times;

        GamePlayer player = new GamePlayer();
        int winTimes = 0;

        for (int i = 0; i < tmp_times; i++) {
            System.out.println("input your chosen symbol: 0 as ROCK, 1 as PAPER, 2 as SCISSORS");
            int input = in.nextInt();
            Symbol symbol;

            if (input == 0) {
                symbol = Symbol.ROCK;
            } else if (input == 1) {
                symbol = Symbol.PAPER;
            } else if (input == 2) {
                symbol = Symbol.SCISSORS;
            } else {
                symbol = null;
                System.out.println("Please input num between 0 and 2");
                tmp_times ++;
                continue;
            }

            Symbol computerSymbol = player.getSymbol();
            System.out.println("Your symbol is " + symbol);
            System.out.println("The computer's symbol is " + computerSymbol);
            if (symbol.getResult(computerSymbol) == GameResult.WIN) {
                System.out.println("You win!");
                winTimes ++;
            } else if (symbol.getResult(computerSymbol) == GameResult.DRAW) {
                System.out.println("You draw!");
            } else {
                System.out.println("You lose!");
            }
        }

        System.out.println("You win " + winTimes + "times");
    }
}
