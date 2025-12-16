package main.java.homework24.transformers;

public class Autobot extends Transformer {

    public static final String EYE_COLOR = "Синие";

    private String teamName;
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " трансформируется в транспортное средство (Chevrolet Camaro)");
    }

    public void printProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + EYE_COLOR);
        System.out.println("Характер: " + (kindness ? "Добрый" : "Злой"));
    }
}
