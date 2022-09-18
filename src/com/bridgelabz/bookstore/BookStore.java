package com.bridgelabz.bookstore;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

    public List<Books> booksList=new LinkedList<>();
    Scanner sc=new Scanner(System.in);

    public void addBook()
    {
        /*Books book1=new Books("Harry potter","james goslin","01 jan 2010","fantasy");
        Books book2=new Books("3 idiots","chetan bhagat","02 feb 2004","educational");
        Books book3=new Books("i do what i do","raghuram rajan","5 march 2018","economics");
        Books book4=new Books("test of my life","yuvraj singh","7 june 2016","autography");
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        System.out.println(booksList);*/
        Books book=new Books();
        System.out.println("Enter book name");
        String bName=sc.nextLine();
        book.setBookName(bName);
        System.out.println("Enter Author name");
        String aName=sc.nextLine();
        book.setAuthor(aName);
        System.out.println("Enter date of book");
        String date=sc.nextLine();
        book.setReleaseDate(date);
        System.out.println("Enter book gener");
        String gener=sc.nextLine();
        book.setGener(gener);
        booksList.add(book);
        System.out.println(booksList);
    }

    public void searchBookByName() {

        System.out.println("Enter book name to search");
        String name=sc.nextLine();
        for (Books b:booksList)
        {
            if(name.equalsIgnoreCase(b.getBookName()))
            {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Book not present in store");

    }

    public void searchByAuthor() {
        System.out.println("Enter author name to search");
        String name=sc.nextLine();
        for (Books b:booksList)
        {
            if(name.equalsIgnoreCase(b.getAuthor()))
            {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Book of author not present in store");

    }

    public void deleteBookByName() {

        System.out.println("Enter book name to remove");
        String name=sc.nextLine();
        for (Books b:booksList)
        {
            if(name.equalsIgnoreCase(b.getBookName()))
            {
                booksList.remove(b);
                System.out.println("book removed from book store");
                return;
            }
        }
        System.out.println("Book of author not present in store");
    }
}
