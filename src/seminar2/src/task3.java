package seminar2.src;/*Задание №3
📔 Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap).
В отдельном методе нужно будет пройти по структуре данных.
Если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {

        File file = new File("/Users/veranikalis/Desktop/exceptions3/seminar2/src/data.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] data = readDataFromFile(file);
        replaceQuestionMarks(data);
        writeDataToFile(file, data);
    }

    private static void writeDataToFile(File file, String[][] data) {
        try (FileWriter writer = new FileWriter(file)) {
            for (String[] row : data) {
                for (String cell : row) {
                    writer.write(cell + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing to file", e);
        }
    }

    private static void replaceQuestionMarks(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            String name = data[i][0];
            String value = data[i][1];

            if (value.equals("?")) {
                // Замена знака "?" на количество букв в имени
                data[i][1] = String.valueOf(name.length());
            } else {
                try {
                    // Проверка, что значение - целое число
                    Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Invalid value '" + value + "' for " + name);
                }
            }
        }
    }


    // Метод для чтения данных из файла
    private static String[][] readDataFromFile(File file) {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid format in line: " + line);
                }
                dataList.add(parts);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading from file", e);
        }

        return dataList.toArray(new String[0][0]);
    }
}