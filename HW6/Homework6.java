package HW6;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;


/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */
public class Homework6{
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0, ansVar = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось
        System.out.println("ТЕСТ: НАЙДИ СВОЙ ГРИБ :)");
        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = new String[]{"Какие отличительные черты гриба подосиновика?",
                                          "Какие отличительные черты гриба подберезовика?",
                                          "Какие отличительные черты белого гриба?"};
        // TODO: Массив вариантов ответов
        String[][] answerOptions = new String[][]{{"Ораньжевая шляпка",
                                                   "Черная шляпка",
                                                   "Шляпка как у Дартаньяна"
                                                  },
                                                  {"Ножка кривая и зеленая шляпка",
                                                   "Коричневая шляпка и ножка похожа на ствол березы",
                                                   "Ножка ровная и шляпка как кокошник",
                                                   "Шляпка как у гвоздя"},
                                                  {"Ножка толстая и шляпка коричневая",
                                                   "Ножка тонкая и кривая, шляпка красная",
                                                   "Похож на яйцо, желтого цвета, сморщенный"}};

        // TODO: Массив правильных ответов
        int[] correctAnswers = new int[]{1,2,1};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for(int i = 0; i < questions.length; i++) {
            // TODO: Вывод вопроса на экран
            System.out.println("ВОПРОС: " + questions[i]);

            // TODO: Вывод вариантов ответов на экран
            System.out.println("Варианты ответов: ");
            for(int j = 0; j < answerOptions[i].length; j++)
                System.out.println(answerOptions[i][j]);



            try {
                ansVar = scanner.nextInt();
            } catch(NoSuchElementException e) {
                System.out.println("Вы ввели не корректный символ, попробуйте еще раз пройти тест.");
                return;
            }

            if(ansVar < 1 || ansVar> 4)
            {
                System.out.println("Вы вышли за границы возможных ответов, попробуйте еще раз пройти тест.");
                return;
            }

            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя

            System.out.print(Integer.toString(ansVar)+" - "+answerOptions[i][ansVar-1]);


            //TODO: Проверяем ответ и выводим результат
            if(ansVar == correctAnswers[i])
                correctCount++;
            else
                wrongCount++;

            // а также увеличиваем счетчики правильных и неправильных ответов

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
