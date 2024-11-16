package hw2.src;/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и
возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
📌*/

import java.util.Scanner;

public class task1 {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input = 0.0f;

        while (true) {
            System.out.print("Enter a float value: ");
            String inputString = scanner.nextLine();

            try {
                input = Float.parseFloat(inputString);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a float value.");
            }
        }

        return input;
    }
    public static void main(String[] args) {
        float input = getFloatInput();
        System.out.println("You entered: " + input);
    }
}
