package main.java.homework24.transformers;

public abstract class Transformer implements Action {

    protected String name;

    public Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        Action.super.run(name);
    }

    public abstract void transform();

    public void printProperties() {
        System.out.println("Имя: " + name);
    }
}