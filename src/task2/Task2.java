package task2;


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*Создать строку string = "Testing, is my favourite job".
                Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.
                Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/

        String string = "Testing, is my favourite job";
        System.out.println(string);
        String string1 = string.substring(0, 7);
        System.out.println(string1);
        System.out.println(string1.length());
        String string2 = string.substring(9, 11);
        System.out.println(string2);
        System.out.println(string2.length());
        String string3 = string.substring(12, 14);
        System.out.println(string3);
        System.out.println(string3.length());
        String string4 = string.substring(15, 24);
        System.out.println(string4);
        System.out.println(string4.length());
        String string5 = string.substring(25, 28);
        System.out.println(string5);
        System.out.println(string5.length());
        System.out.println(string5);

        boolean stringResult = string1.equals(string2 + string3 + string4 + string5);
        System.out.println(stringResult);
    }


}
