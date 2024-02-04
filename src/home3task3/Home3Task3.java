package home3task3;

import java.util.Arrays;
import java.util.Scanner;

public class Home3Task3 {
    public static void main(String[] args) {

       /* При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
        и всегда отнимать от большего меньшее. Вывести эту разность в консоль.*/

       Scanner scanner = new Scanner(System.in);
        System.out.println("Разность двох чисел");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String message = x > y ? "числа вычитаются" : "числа не вычитаются";
        System.out.println(message);


         }

}











