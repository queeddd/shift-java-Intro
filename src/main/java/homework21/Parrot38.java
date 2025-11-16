public class Parrot38 {
    public static void main(String[] args) {

        double snakeCm = 380;

        double snakeM = snakeCm / 100;

        double parrot = snakeM / 38;
        double monkey = snakeM / 5;
        double elephant = snakeM / 2;

        double sum = snakeM + parrot + monkey + elephant;

        System.out.println("Рост удава: " + snakeM + " м");
        System.out.println("Рост попугая: " + parrot + " м");
        System.out.println("Рост мартышки: " + monkey + " м");
        System.out.println("Рост слонёнка: " + elephant + " м");
        System.out.println("Суммарный рост всех персонажей: " + sum + " м");
    }
}
