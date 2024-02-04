import java.util.Arrays;
import java.util.Scanner;

public class home3task2 {
    public static void main(String[] args) {

        /*Пользователь вводит с клавиатуры три целочисленных значения. На экран выводится информация можно ли из этих сторон
        построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).*/

        Scanner xyz = new Scanner(System.in);
        System.out.println("Insert number");
        int x = xyz.nextInt();
        int y = xyz.nextInt();
        int z = xyz.nextInt();


        if ( x == 0 || y == 0 || z == 0) {
            System.out.println("Треугольник нельзя построить");
        } else if (x >= y + z  || y >= z + x || z >= x + y) {
            System.out.println("Треугольник можно построить");
        }
        else {
            System.out.println("Треугольник нельзя построить");
        }
    }
}




