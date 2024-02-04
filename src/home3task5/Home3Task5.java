package home3task5;

import java.util.Arrays;
import java.util.Scanner;

public class Home3Task5 {
    public static void main(String[] args) {

       /* Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры
        два числа и символ – или + или % или / или *. На экран выводится резултат действия над двумя
        введенными числами. Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int number1 = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());
        System.out.println("Введите одно из доступных действий: - + % / *");
        String symbol= scanner.next();
        int result = symbol.equals("-") ? number1 - number2 : symbol.equals("+") ? number1 + number2 :
                     symbol.equals("%") ? number1 % number2 : symbol.equals("/") ? number1 / number2 :
                             symbol.equals("*") ? number1 * number2 : 0;
        System.out.println( "Ваш результат" + " " +  result);

    }
}
