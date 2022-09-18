package com.bridgelabz.bookstore;

public class Books {

    String bookName;
    String author;
    String releaseDate;
    String gener;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Books()
    {

    }


    public Books(String bookName, String author, String releaseDate, String gener) {
        this.bookName = bookName;
        this.author = author;
        this.releaseDate = releaseDate;
        this.gener = gener;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", gener='" + gener + '\'' +
                '}';
    }
}
