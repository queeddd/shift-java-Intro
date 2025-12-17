package main.java.homework24.transformers;

public class Autobot extends Transformer {

    public static final String EYE_COLOR = "Синие";

    private String teamName;
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в транспортное средство (Chevrolet Camaro)");
    }

    @Override
    public void fire() {
        System.out.println(name + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(name + " заряжается");
    }

    @Override
    public void printProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + EYE_COLOR);
        System.out.println("Характер: " + (kindness ? "Добрый" : "Злой"));
    }
}
