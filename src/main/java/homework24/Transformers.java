public class Transformers {
    public static void main(String[] args) {
        Autobot autobot = new Autobot("Бамблби", "Автоботы");
        Decepticon decepticon = new Decepticon("Мегатрон", "Десептиконы");

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
    }
}

class Transformer {
    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void fire() {
        System.out.println(name + " стреляет");
    }

    public void charge() {
        System.out.println(name + " заряжается");
    }

    public void printProperties() {
        System.out.println("Имя: " + name);
    }
}

class Autobot extends Transformer {
    public String teamName;
    public final String eyeColor = "Cиние";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " трансформируется в Сhevrolet Сamaro"); // транспортное средство)
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

class Decepticon extends Transformer {
    public String teamName;
    public final String eyeColor = "Красные";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(name + " трансформируется в футуристический звездолет"); // Футуристический звездолет = наземный и воздушны транспорт, оружие, техника
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