public class level2 {
    public static void main(String[] args) {
        int[][] point = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };

        int[] sumPoint = new int[5];
        String[] name = {"Alex","Igor","Michael","Nicolay","Vladimir"};

        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point[i].length; j++) {
                sumPoint[i] += point[i][j];
            }
            String[] result = new String[5];
            result[i] = name[i] + sumPoint[i];
            System.out.println(result[i]);
        }
    }
}