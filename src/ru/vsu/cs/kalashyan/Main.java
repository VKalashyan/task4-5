package ru.vsu.cs.kalashyan;

public class Main {

    public static void main(String[] args) {
        double y = getY();
        System.out.print("Answer: " + y);
    }

    public static double getY() {
        double y = 0;
        for (double i = 0; i <= 10; i++) {
            y += Math.sin(1 + i / 10);
        }
        return y;
    }
}
