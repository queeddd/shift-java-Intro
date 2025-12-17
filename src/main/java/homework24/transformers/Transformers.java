package main.java.homework24.transformers;

import java.util.ArrayList;
import java.util.List;

public class Transformers {
    public static void main(String[] args) {

        Autobot autobot = new Autobot("Бамблби", "Автоботы");
        Decepticon decepticon = new Decepticon("Мегатрон", "Десептиконы");

        List<Transformer> team = new ArrayList<>();
        team.add(autobot);
        team.add(decepticon);

        System.out.println("=== Действия трансформеров ===");
        for (Transformer transformer : team) {
            System.out.println("--- Для: " + transformer.getName() + " ---");

            transformer.run();
            transformer.fire();
            transformer.charge();
            transformer.transform();
            transformer.printProperties();

            System.out.println();
        }
    }
}