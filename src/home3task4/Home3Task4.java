package home3task4;

import java.util.Arrays;
import java.util.Scanner;

public class Home3Task4 {
    public static void main(String[] args) {
        /*(Использовать операторы if-else-if) Пользоватьель вводит с клавиатуры числа: Если число равно 1,
            то выводин на консоль “Понедельник”; Если число равно 2, то выводин на консоль “Вторник”;
            Если число равно 3, то выводин на консоль “Среда”; Если число равно 4,
            то выводин на консоль “Четверг”; Если число равно 5, то выводин на консоль “Пятница”;
            Если число равно 6, то выводин на консоль “Суббота”; Если число равно 7,
            то выводин на консоль “Воскресенье”; В противном случае выводим текст: “Лучше бы сегодня была пятница”.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int x = scanner.nextInt();
        if ( x == 1) {
            System.out.println("Понедельник");
        } else if (x == 2) {
            System.out.println("Вторник");
        } else if (x == 3) {
            System.out.println("Среда");
        } else if (x == 4) {
            System.out.println("Четверг");
        } else if (x == 5) {
            System.out.println("Пятница");
        } else if (x == 6) {
            System.out.println("Суббота");
        }
        else {
            System.out.println("Лучше бы сегодня была пятница");

        }
    }
    }















