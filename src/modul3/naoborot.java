package modul3;

import java.util.Scanner;

public class naoborot {

    static String text = "Жили-были старик со старухой.\n" +
            "Вот и говорит старик старухе:\n" +
            "— Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Что сделать с текстом?\n" +
                    "1.Удалить пробелы.\n" +
                    "2.Сделать все заглавными или 3.строчными.\n" +
                    "4.Посчитать количество символов.\n" +
                    "0.Выйти из программы.\n" +
                    "Введите цифру: \n");
            String num = sc.nextLine();

            switch (num) {
                case "1":
                    System.out.println(text.replaceAll(" ", ""));
                    break;
                case "2":
                    System.out.println(text.toUpperCase());
                    break;
                case "3":
                    System.out.println(text.toLowerCase());
                    break;
                case "4":
                    System.out.println(text.length());
                    break;
                case "0":
                    running = false;
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Некорректный ответ.");
            }
        }
    }
}
