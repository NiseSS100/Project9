package fmi.informatics.hw9;

import fmi.informatics.functional.Rock;

public class Main extends Tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

        Rock onEarth = new Rock();
        onEarth.drop(onEarth.height());
    }
}
