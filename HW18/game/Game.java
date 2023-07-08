package HW18.game;

public class Game {

    private final Dice dice;
    private final GameWinnerPrinter winnerPrinter;

    public int getPlayer1Result() {
        return player1Result;
    }

    int player1Result;

    public int getPlayer2Result() {
        return player2Result;
    }

    int player2Result;

    public Game(Dice dice, GameWinnerPrinter winnerPrinter) {
        this.dice = dice;
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        player1Result = dice.roll();
        player2Result = dice.roll();

        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    }

    public void playGame2(Player player1, Player player2) {
        player1Result = dice.roll(1, 6);
        player2Result = dice.roll(1, 6);

        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    }



}
