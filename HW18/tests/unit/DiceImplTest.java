package HW18.tests.unit;

import HW18.game.DiceImpl;

import static HW18.assertions.Assertions.assertEquals;

public class DiceImplTest {

    public void testDiceImplValueFromOneToSixV1(){
      String scenario = "Тест выпадания кубика на значения от 1 до 6 V.1 \n";
      try{
          int val = new DiceImpl().roll();
          assertEquals(val);
          System.out.printf("\"%s\"Значение кубика %d %n", scenario, val);
      }catch (AssertionError e) {
          System.err.printf("\"%s\"Значение кубика \" %s\" %n", scenario, e.getMessage());
      }
    }

    public void testDiceImplValueFromOneToSixV2(){
        String scenario = "Тест выпадания кубика на значения от 1 до 6 V.2 \n";
        try{
            int val = new DiceImpl().roll(1, 6);
            assertEquals(val);
            System.out.printf("\"%s\"Значение кубика %d %n", scenario, val);
        }catch (AssertionError e) {
            System.err.printf("\"%s\"Значение кубика \" %s\" %n", scenario, e.getMessage());
        }
    }

}
