package ru.mirea.task3;

class HumanTest{
    public static void main(String[] arr) {
        Human f = new Human(19,18,14);
        Human s = new Human(14.8f,12.9f,13.2f);

        System.out.println("Первые рамзеры:");
        System.out.println("Leg = " + f.getLeg() + "\nHead = " + f.getHead() + "\nHand = " + f.getHand());

        System.out.println("\nВторые показания:");
        System.out.println("Leg = " + s.getLeg() + "\nHead = " + s.getHead() + "\nHand = " + s.getHand());

        f.setHand(14);
        System.out.println("Первый размер руки изменен на " + f.getHand());

        s.setLeg(14.8f);
        System.out.print("Второй размер ноги изменен на " + s.getLeg());
    }
}
