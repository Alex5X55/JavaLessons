package HW18.assertions;

public class Assertions {

    public static void assertEquals(int value) {
        if ((value <= 0) || (value > 6))  {
            throw new AssertionError(String.format("Не правильное значение кубика %d", value));
        }
    }

    public static void assertEqualsGame(int player1Result, int player2Result) {
        if (player1Result == player2Result)  {
            throw new AssertionError(String.format("Значение кубиков у игроков одинаковое, ничья %d", player1Result));
        }

        assertEquals(player1Result);
        assertEquals(player2Result);
    }




    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError(String.format("Expected %d = %d", expected, actual));
        }
    }

    public static void assertEquals(long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError(String.format("Expected %d = %d", expected, actual));
        }
    }

    public static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
        }
    }

    public static void assertEquals(Class<? extends Throwable> expected, Class<? extends Throwable> actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected, actual));
        }
    }

    public static void assertThrows(Class<? extends Throwable> expected, Runnable code) {
        Throwable actual = null;
        try {
            code.run();
        } catch (Throwable e) {
            actual = e;
        }
        if (actual == null) {
            throw new AssertionError("Given code does not throw any exception");
        }

        if (!actual.getClass().equals(expected)) {
            throw new AssertionError(String.format("Expected \"%s\" = \"%s\"", expected.getSimpleName(), actual.getClass().getSimpleName()));
        }
    }

}
