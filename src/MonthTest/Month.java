package MonthTest;

public class Month {
    public static void numberMonth(int m) {

        switch (m) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 30:
                System.out.println(30);
                break;
            case 31:
                System.out.println(31);
                break;
            default:
                System.out.println("Нет таких цифр в месяцах");
        }
    }

    public static void main(String[] args) {
        numberMonth(32);
    }

}