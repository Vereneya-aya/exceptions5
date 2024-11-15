import java.io.FileNotFoundException;

public class task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            }
            printSum(23, 234);
            int[] abc = {1, 2};
            int index = 3;
            if (index < abc.length) {
                System.out.println(abc[index]);
            }
        }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
