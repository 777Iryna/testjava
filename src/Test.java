import java.util.Arrays;

public class Test {
    /*Coздать две переменные типа int:
    int a = 7;
    int b = 9;
    Поменять между собой значения переменных a и b.
    Создавать новые переменные нельзя.
    Можно применять только арифметические действия к перемнным a и b.
    Вывести в консоль  значения переменных a и b после их переопределения.*/
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a =  b - a + a;
        System.out.println(a);
        b = (a + b) - (++a - b + a);
        System.out.println(b);
    }


}

