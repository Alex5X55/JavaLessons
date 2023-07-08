package HW18.tests.unit;

import HW18.game.*;

import static HW18.assertions.Assertions.assertEquals;
import static HW18.assertions.Assertions.assertEqualsGame;

public class GameTest {
    public void testGameV1(){
        String scenario = "Тест игры в кубики двумя игроками V.1 \n";
        try{
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            assertEqualsGame(game.getPlayer1Result(), game.getPlayer2Result());
            System.out.printf("\"%s\"Розыгрыш прошел успешно %n", scenario);
        }catch (AssertionError e) {
            System.err.printf("\"%s\"Розыгрыш прошел неуспешно \" %s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameV2(){
        String scenario = "Тест игры в кубики двумя игроками V.2 \n";
        try{
            Dice dice = new DiceImpl();
            GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame2(new Player("Вася"), new Player("Игорь"));
            assertEqualsGame(game.getPlayer1Result(), game.getPlayer2Result());
            System.out.printf("\"%s\"Розыгрыш прошел успешно %n", scenario);
        }catch (AssertionError e) {
            System.err.printf("\"%s\"Розыгрыш прошел неуспешно \" %s\" %n", scenario, e.getMessage());
        }
    }
}
