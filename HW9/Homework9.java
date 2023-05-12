package HW9;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class Homework9{

    public static class Answer {
        private int _number;
        private String _text;
        private boolean _isRightAnswer;

        public Answer() {

        }

        public Answer(int number, String text, boolean isRightAnswer){
            _number = number;
            _text = text;
            _isRightAnswer = isRightAnswer;
        }

        void Print(){
            System.out.println(_text);
        }
    }

    public static class Question {
        private int _number;
        private String _text;
        Answer[] _answers = new Answer[3];

        public Question() {

        }

        public Question(int number, String text){
            _number = number;
            _text = text;
        }

        void Print(){
            System.out.println(_text);
            for (Answer a : _answers)
                a.Print();
        }

        boolean isRightAnswer(int anwrnumber){
            return _answers[anwrnumber-1]._isRightAnswer;
        }
    }

    public static void main(String[] args) {
        int _correctCount = 0, _wrongCount = 0, _ansVar = 0;

        Question[] _questions = new Question[]{new Question(1, "Какие отличительные черты гриба подосиновика?"),
                new Question(2, "Какие отличительные черты гриба подберезовика?"),
                new Question(3, "Какие отличительные черты белого гриба?")
        };

        _questions[0]._answers[0] = new Answer(1, "Ораньжевая шляпка", true);
        _questions[0]._answers[1] = new Answer(2, "Черная шляпка", false);
        _questions[0]._answers[2] = new Answer(3, "Шляпка как у Дартаньяна", false);

        _questions[1]._answers[0] = new Answer(1, "Ножка кривая и зеленая шляпка", false);
        _questions[1]._answers[1] = new Answer(2, "Коричневая шляпка и ножка похожа на ствол березы", true);
        _questions[1]._answers[2] = new Answer(3, "Ножка ровная и шляпка как кокошник", false);

        _questions[2]._answers[0] = new Answer(1, "Ножка толстая и шляпка коричневая", true);
        _questions[2]._answers[1] = new Answer(2, "Ножка тонкая и кривая, шляпка красная", false);
        _questions[2]._answers[2] = new Answer(3, "Похож на яйцо, желтого цвета, сморщенный", false);


        Scanner scanner = new Scanner(System.in);

        System.out.println("ТЕСТ: НАЙДИ СВОЙ ГРИБ :)");
        for (Question q : _questions) {
            q.Print();

        try {
                _ansVar = scanner.nextInt();
            } catch(NoSuchElementException e) {
                System.out.println("Вы ввели не корректный символ, попробуйте еще раз пройти тест.");
                return;
            }

        if(_ansVar < 1 || _ansVar> 3)
        {
            System.out.println("Вы вышли за границы возможных ответов, попробуйте еще раз пройти тест.");
            return;
        }

        System.out.println("Ваш ответ: " + Integer.toString(_ansVar)+" - "+ q._answers[_ansVar-1]._text);
        if(q.isRightAnswer(_ansVar))
            _correctCount++;
        else
            _wrongCount++;
    }

    System.out.println("Результат: правильно " + _correctCount + ", неправильно " + _wrongCount);
    }
}


