public class Main {
    public static void main(String[] args) {
        int[] array = {4,7,2,7,-20,-6,30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        System.out.println(" ");
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        System.out.println("Сумма элементов массива: " + sumArray);

        int maxEllement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxEllement < array[i]) {
                maxEllement = array[i];
            }
        }
        System.out.println("Наибольший элемент: " + maxEllement);

    }
}
