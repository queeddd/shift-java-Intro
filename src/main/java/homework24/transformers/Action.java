package main.java.homework24.transformers;

public interface Action {

    default void run(String name) {
        System.out.println(name + " бежит");
    }

    void fire();
    void charge();
}