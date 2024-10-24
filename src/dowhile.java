import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        if (password.length() > 8 || password.length() < 15) {
        do {
            System.out.print("Пароль должен быть от 8 до 15 символов. Придумайте другой пароль: ");
            password = scanner.nextLine();
        }
        while (password.length() < 8 || password.length() > 15);
        }
        System.out.println("Ваше имя: " + name);
        System.out.println("Пароль: " + password);
    }
}