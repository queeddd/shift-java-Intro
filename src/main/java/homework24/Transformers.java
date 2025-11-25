import java.util.ArrayList;
import java.util.List;

public class Transformers {
    public static void main(String[] args) {

        Autobot autobot = new Autobot("Бамблби", "Автоботы");
        Decepticon decepticon = new Decepticon("Мегатрон", "Десептиконы");

        System.out.println("=== Индивидуальные действия ===");
        autobot.run();
        autobot.fire();
        autobot.charge();
        autobot.transform();
        autobot.printProperties();

        System.out.println();

        decepticon.run();
        decepticon.fire();
        decepticon.charge();
        decepticon.transform();
        decepticon.printProperties();

        System.out.println();
        List<Transformer> team = new ArrayList<>();
        team.add(autobot);
        team.add(decepticon);

        System.out.println("=== Действия по списку трансформеров ===");
        for (Transformer t : team) {
            System.out.println("--- Для: " + t.getName() + " ---");
            t.transform();

            if (t instanceof Action) {
                Action a = (Action) t;
                a.run();
                a.fire();
                a.charge();
            }

            t.printProperties();
            System.out.println();
        }
    }
}

abstract class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void transform();

    public void printProperties() {
        System.out.println("Имя: " + name);
    }
}

interface Action {
    default void run() {
        System.out.println(getName() + " бежит");
    }

    void fire();
    void charge();

    String getName();
}

class Autobot extends Transformer implements Action {
    public String teamName;
    public final String eyeColor = "Cиние";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в Сhevrolet Сamaro"); // транспортное средство)
    }

    @Override
    public void fire() {
        System.out.println(name + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(name + " заряжается");
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    @Override
    public void printProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Добрый: " + kindness);
    }
}

class Decepticon extends Transformer implements Action {
    public String teamName;
    public final String eyeColor = "Красные";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void transform() {
        System.out.println(name + " трансформируется в футуристический звездолет"); // Футуристический звездолет = наземный и воздушны транспорт, оружие, техника
    }

    @Override
    public void fire() {
        System.out.println(name + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(name + " заряжается");
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    @Override
    public void printProperties() {
        System.out.println("Имя: " + name);
        System.out.println("Команда: " + teamName);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Добрый: " + kindness);
    }
}