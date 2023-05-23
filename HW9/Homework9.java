package HW9;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class Homework9{

    private static Answer[][] answers =
            {
                    {
                            new Answer(1, "Оранжевая шляпка", true),
                            new Answer(2, "Черная шляпка", false),
                            new Answer(3, "Шляпка как у Дартаньяна", false)
                    },
                    {
                            new Answer(1, "Ножка кривая и зеленая шляпка", false),
                            new Answer(2, "Коричневая шляпка и ножка похожа на ствол березы", true),
                            new Answer(3, "Ножка ровная и шляпка как кокошник", false),
                            new Answer(4,  "Шляпка как у гвоздя", false)
                    },
                    {
                            new Answer(1, "Ножка толстая и шляпка коричневая", true),
                            new Answer(2, "Ножка тонкая и кривая, шляпка красная", false),
                            new Answer(3, "Похож на яйцо, желтого цвета, сморщенный", false)
                    }
            };


    private static Question[] questions = {new Question(1, "Какие отличительные черты гриба подосиновика?", answers[0]),
            new Question(2, "Какие отличительные черты гриба подберезовика?", answers[1]),
            new Question(3, "Какие отличительные черты белого гриба?", answers[2])
    };

    static class Answer {
        private int number;
        private String text;
        private boolean isRightAnswer;

        public Answer() {

        }

        public Answer(int number, String text, boolean isRightAnswer){
            this.text = text;
            this.isRightAnswer = isRightAnswer;
        }

        void print(){
            System.out.println(text);
        }
    }

    static class Question {
        private int number;
        private String text;
        private Answer[] answers;

        public Question() {

        }

        public Question(int number, String text, Answer[] answers ){
            this.number = number;
            this.text = text;
            this.answers = answers;
        }

        public void print(){
            System.out.println(text);
            for (Answer a : answers)
                a.print();
        }

        boolean isRightAnswer(int anwrnumber){
            return answers[anwrnumber-1].isRightAnswer;
        }
    }

    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0, ansVar = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ТЕСТ: НАЙДИ СВОЙ ГРИБ :)");
        for (Question q : questions) {
            q.print();

        try {
                ansVar = scanner.nextInt();
            } catch(NoSuchElementException e) {
                System.out.println("Вы ввели не корректный символ, попробуйте еще раз пройти тест.");
                return;
            }

        if(ansVar < 1 || ansVar > q.answers.length)
        {
            System.out.println("Вы вышли за границы возможных ответов, попробуйте еще раз пройти тест.");
            return;
        }

        System.out.println("Ваш ответ: " + Integer.toString(ansVar)+" - "+ q.answers[ansVar-1].text);
        if(q.isRightAnswer(ansVar))
            correctCount++;
        else
            wrongCount++;
    }

    System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}


