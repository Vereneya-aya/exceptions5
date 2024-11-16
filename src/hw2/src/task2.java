package hw2.src;

public class task2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int d = 2;
        if (intArray.length-1<8){
            System.out.println("Array has less than 9 elements");
        } else if (d == 0) {
            System.out.println("division by 0 not supported");
        }
        else {
            double result = intArray[8] / d;
            System.out.println("Result = " + result);
        }
    }
}
