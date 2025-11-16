import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int start = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int end = scanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();

        if (step <= 0) {
            System.out.println("Ошибка: шаг должен быть больше 0.");
            return;
        }

        if (start > end) {
            System.out.println("Ошибка: первое число должно быть меньше или равно второму.");
            return;
        }
        printTable(start, end, step);
    }

    public static void printTable(int start, int end, int step) {

        int maxWidth = 0;

        for (int y = start; y <= end; y += step) {
            for (int x = start; x <= end; x += step) {
                int product = x * y;
                int width = getCellWidth(product);
                if (width > maxWidth) {
                    maxWidth = width;
                }
            }
        }

        System.out.print("   ");
        for (int x = start; x <= end; x += step) {
            System.out.printf("%" + (maxWidth + 1) + "d", x);
        }
        System.out.println();

        for (int y = start; y <= end; y += step) {
            System.out.printf("%" + maxWidth + "d ", y);
            for (int x = start; x <= end; x += step) {
                int product = x * y;
                System.out.printf("%" + (maxWidth + 1) + "d", product);
            }
            System.out.println();
        }
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}
