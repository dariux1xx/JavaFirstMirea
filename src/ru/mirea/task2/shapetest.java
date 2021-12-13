package ru.mirea.task2;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape("овал");
        shape.setType("круг");
        System.out.println("Тип фигуры: " + shape.getType());
    }
}
