import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplicationTableToFile {
    public static void main(String[] args) {
        String fileName = "multiplication_table.txt";

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    pw.print(i + " * " + j + " = " + (i * j));

                    pw.print("\t");
                }

                pw.println();
            }

            pw.close();

            System.out.println("Таблица умножения записана в файл: " + fileName);

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом!");
            e.printStackTrace();
        }
    }
}