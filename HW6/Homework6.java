package HW6;

import java.util.Scanner;

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
        String[][] answerOptions = new String[][]{{"1 - Ораньжевая шляпка",
                                                   "2 - Черная шляпка",
                                                   "3 - Шляпка как у Дартяньна"},
                                                  {"1 - Ножка кривая и зеленая шляпка",
                                                   "2 - Коричневая шляпка и ножка похожа на ствол березы",
                                                   "3 - Ножка ровная и шляпка как кокошник"},
                                                  {"1 - Ножка толстая и шляпка коричневая",
                                                   "2 - Ножка тонкая и кривая, шляпка красная",
                                                   "3 - похож на яйцо, желтого цвета, сморщенный"}};

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
            for(int j = 0; j < answerOptions.length; j++)
                System.out.println(answerOptions[i][j]);

            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя
            ansVar = scanner.nextInt();

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
