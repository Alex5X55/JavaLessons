package HW18;


import HW18.game.*;
import HW18.tests.unit.DiceImplTest;
import HW18.tests.unit.GameTest;

public class HomeWork {

    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше

        Написать тесты (минимум 4) на классы DiceImpl и Game.
        Тесты должны найти не менее двух ошибок.

        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        new DiceImplTest().testDiceImplValueFromOneToSixV1();
        System.out.println("\n\n----------------------\n\n");
        new DiceImplTest().testDiceImplValueFromOneToSixV2();
        System.out.println("\n\n----------------------\n\n");
        new GameTest().testGameV1();
        System.out.println("\n\n----------------------\n\n");
        new GameTest().testGameV2();
        System.out.println("\n\n----------------------\n\n");
    }
    
}