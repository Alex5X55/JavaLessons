package HW14;

import HW13.Account;
import HW13.Client;

import java.util.*;
import java.io.*;


public class Homework14{
    static final int MAX_MUSHROOM_IN_BASKET = 8;

    static private Collection<Basket> baskets = new HashSet<Basket>();
    public static void main(String[] args) throws MushroomException {
        int basketCount = 0;
        try(Scanner scanner = new Scanner(System.in);) {
           System.out.println("Введите количество корзин: ");
           try{
               basketCount = scanner.nextInt();
              } catch(NoSuchElementException e) {
               throw new Exception("Вы ввели не корректный символ, попробуйте еще раз.",e);
           }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        try {
             for(int a = 0; a<basketCount; a++) {
                 int mCount = new Random().nextInt(10);
                 baskets.add(new Basket(mCount, "Корзина " + Integer.toString(a+1)));
              }
            System.out.println(baskets.toString());
        }catch (Exception e){
          e.printStackTrace();
          throw new MushroomException(e.getMessage());

        }
    }

}