package main.java.homework24.transformers;

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