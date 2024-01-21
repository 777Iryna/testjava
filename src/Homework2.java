import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
                /*Создать переменную string1 = "This line that i want to cut, cause it is too long".
                Создать строку string2 в которой должно быть помещено значение строки string1,
        Обрезанное до "This line that i want to cut, cause".
                Создать строку string3 на основе string2 которое будет содержать значение
        "This line that don't want to cut, cause it is perfect".
                Вывести на консоль каждое сообщение и его длину.*/
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = "This line that i want to cut, cause \nit is too long";
        String string3 = "This line that i want to cut, cause it is too long";
        System.out.println(string3.replace("i want", "don't want").
                replace("too long", "perfect"));



    }
}
