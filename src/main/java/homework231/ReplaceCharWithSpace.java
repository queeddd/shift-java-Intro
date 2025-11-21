import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceCharWithSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите исходную строку:");
        String originalInput = br.readLine();
        if (originalInput == null) {
            System.out.println("Пустой ввод. Программа завершена.");
            return;
        }

        System.out.println("Введите искомый символ (один символ, не пробел):");
        String searchLine = br.readLine();
        if (searchLine == null || searchLine.length() == 0) {
            System.out.println("Символ не введён. Программа завершена.");
            return;
        }
        char searchChar = searchLine.charAt(0);

        if (searchChar == ' ') {
            System.out.println("Ошибка: искомый символ не может быть пробелом.");
            return;
        }

        String normalized = normalizeSpaces(originalInput);

        String result = replaceCharWithSingleSpaces(normalized, searchChar);

        if (normalized.equals(result)) {
            System.out.println("После преобразований строка не изменилась.");
            System.out.println("Исходная (нормализованная): " + normalized);
        } else {
            System.out.println("Исходная и получившаяся строка:");
            System.out.println(normalized + " -> " + result);
        }
    }

    private static String normalizeSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        boolean lastWasSpace = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!lastWasSpace) {
                    // добавляем ровно один пробел
                    sb.append(' ');
                    lastWasSpace = true;
                }
            } else {
                sb.append(c);
                lastWasSpace = false;
            }
        }
        String temp = sb.toString();
        return temp.trim();
    }

    private static String replaceCharWithSingleSpaces(String s, char search) {
        StringBuilder sb = new StringBuilder();
        boolean lastWasSpace = false; // отслеживаем, какой символ добавлен последним
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == search) {
                if (!lastWasSpace) {
                    sb.append(' ');
                    lastWasSpace = true;
                }
            } else {
                sb.append(c);
                lastWasSpace = (c == ' ');
            }
        }
        return sb.toString().trim();
    }
}