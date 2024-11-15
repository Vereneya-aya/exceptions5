import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("input index");
        int index = 0;
        //I want to check if input is number
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
        }
        index = scanner.nextInt();
        //I want to check if input is within array bounds
        while (index > arr.length) {
            System.out.println("Index out of bounds. Please enter a number within the array bounds");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
            }
            index = scanner.nextInt();
        }
        arr[index] = 1;
        System.out.println(Arrays.toString(arr));
    }
}