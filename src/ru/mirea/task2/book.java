package ru.mirea.task2;

public class Book {
    private String author;
    private String title;
    private int year;
    private String publisher;
    private int valueOfPages;

    public Book(String author, String title, int year, int valueOfPages, String publisher){
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.title = title;
        this.valueOfPages = valueOfPages;
    }

    public String toString(){
        return "Book{"
                + "Author name='" + author + "'"
                +  ", Title='" + title + "'"
                + ", Year of publish=" + year
                + ", Value Of Pages=" + valueOfPages
                + ", Publisher='" + publisher + "'}";
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getValueOfPages() {
        return valueOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setValueOfPage(int valueOfPages) {
        this.valueOfPages = valueOfPages;
    }
}
