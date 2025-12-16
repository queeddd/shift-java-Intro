package main.java.homework24.transformers;

public class Decepticon extends Transformer {

    public static final String EYE_COLOR = "Красные";

    private String teamName;
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(
                name + " трансформируется в наземный и воздушный транспорт, оружие и боевую технику"
        );
    }

    public void printProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + EYE_COLOR);
        System.out.println("Характер: " + (kindness ? "Добрый" : "Злой"));
    }
}
