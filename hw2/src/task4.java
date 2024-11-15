/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class task4 {
    public static void main(String[] args) {
        try {
            String input = "";
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty");
            }
            System.out.println("Input is valid");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}
