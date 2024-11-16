package seminar2.src;

public class task2 {
    public static void main(String[] args) {
        String[][] arr = {{"o", "2", "3", "4", "5"}, {"6", "7", "8", "9", "10"}, {"11", "12", "13", "14", "15"}};
        System.out.println("Sum of all elements in the 2D array: " + sum2d(arr));
    }
        public static int sum2d(String[][] arr) {
            int sum = 0;
            if (arr != null){
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        int val = tryParseInt(arr[i][j]);
                        sum += val;
                    }
                }
            }
            return sum;
        }

        public static int tryParseInt(String a){
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return 0;
        }
        }
}
