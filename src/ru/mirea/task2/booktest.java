package ru.mirea.task2;

public class testBook
{

    public static void main(String[] args)
    {
        Book shining = new Book("Pushkin", "Master", 1850, 230, "Moscow");
        System.out.println(shining.getYear());
        shining.setYear(1820);
        System.out.println(shining.getAuthor());
        System.out.println(shining.getYear());
        System.out.println(shining);
    }
}
