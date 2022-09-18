package com.bridgelabz.cart;

import com.bridgelabz.bookstore.BookStore;
import com.bridgelabz.bookstore.Books;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CartList  {

    List<Books> bookCart=new LinkedList<>();
    public BookStore bookStore;
    public CartList(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    Scanner sc=new Scanner(System.in);

    public void bookToCart()
    {
        System.out.println("Enter book name to add in cart");
        String n=sc.nextLine();
        for(Books b:bookStore.booksList)
        {
            if(n.equalsIgnoreCase(b.getBookName()))
            {
                bookCart.add(b);
                System.out.println(bookCart);
                return;
            }
        }
        System.out.println("Book not present in store");
        //return null;
    }
}
