
import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        /*У вас есть строка “Я тестирую замечательно. Что еще нужно?”, которую нужно ввести с клавиатуры в консоль.
                Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить
        перемнным типа String следующие значения: string1 = Я string2 = тестирую string3 = замечательно string4 =
            Что еще нужно? Помимо string1, string2, string3, string4 новых переменных создавать нельзя.*/
        Scanner text = new Scanner (System.in);
        String String1 = text.next();
        System.out.println(String1);
        String String2 = text.next();
        System.out.println(String2);
        String String3 = text.next();
        System.out.println(String3);
        String String4 = ("Что еще нужно?");
        System.out.println(String4);


    }
}
