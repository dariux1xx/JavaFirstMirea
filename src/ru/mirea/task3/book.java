package ru.mirea.task3;

public class Book {
    private String author, name_book;
    private int pages;

    public Book(String n, int p, String a){
        name_book = n;
        pages = p;
        author = a;
    }
    public void SetAut (String author){         //функция присваивает какое-то значение
        this.author = author;   //полю author текущей книги присваивает новое значение
    }
    public String GetAut (){   //функция которая возвращает значение
        return this.author;    //возвращается author текущей книги
    }
    public void SetPages(int pages){
        this.pages = pages;
    }
    public int GetPages (){
        return this.pages;
    }
    public void SetName(String name_book){
        this.name_book = name_book;
    }
    public String GetName (){
        return this.name_book;
    }
    public void PrintBook(){
        System.out.println("Author this book is " + this.author);
        System.out.println("Number of pages are " + this.pages);
        System.out.println("Name book is " + this.name_book + "\n");
    }
}
