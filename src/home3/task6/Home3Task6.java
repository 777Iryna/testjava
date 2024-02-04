package home3.task6;

import java.util.Arrays;
import java.util.Scanner;

public class Home3Task6 {
    /*Используя оператор switch написать программу, которая выводит на консоль ссылку для
    скачивания программы. Из выбора программ взять: IntelliJ IDEA, Git, Java.
    Из выбора ОС взять: Linux, macOS, Windows. Программа должна спросить пользователя
    какая программа ему интересна, также спросить какую ОС он использует, а после вывести
    в консоль необходимую ссылку. Если программа с таким названием не существует выводит
    сообщение в консоль, о том что такой программы не существует. Если указанной пользователем
    ОС нет, то выводится сообщение в консоль, о том что такой ОС не существует.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая программа вам интересна?");
        String pr = scanner.nextLine();

        System.out.println("Какую ОС вы используете?");
        String os = scanner.nextLine();

        switch (pr) {
            case ("IntelliJ IDEA"):

                switch (os) {
                    case ("Linux"):
                        System.out.println("Ссылка 1");
                        break;

                    case ("macOS"):
                        System.out.println("Ссылка 2");
                        break;

                    case ("Windows"):
                        System.out.println("Ссылка 3");
                        break;

                    default:
                        System.out.println("Такой ОС не существует");
                }
                break;

                case ("Git"):

                    switch (os) {
                        case ("Linux"):
                            System.out.println("Ссылка 4");
                            break;

                        case ("macOS"):
                            System.out.println("Ссылка 5");
                            break;

                        case ("Windows"):
                            System.out.println("Ссылка 6");
                            break;

                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;

                    case ("Java"):

                    switch (os) {
                        case ("Linux"):
                            System.out.println("Ссылка 7");
                            break;

                        case ("macOS"):
                            System.out.println("Ссылка 8");
                            break;

                        case ("Windows"):
                            System.out.println("Ссылка 9");
                            break;

                        default:
                            System.out.println("Такой ОС не существует");
                    }
                    break;
                }
            }
        }








