package ru.mirea.task3;

public class testBook {
    public static void main(String[] args) {
        Book book1 = new Book("Nothing", 450, "Kto-to");
        book1.PrintBook();
        book1.SetAut("Joanne Rowling");
        book1.SetName("Harry Potter");
        book1.SetPages(832);
        book1.PrintBook();
    }
}
