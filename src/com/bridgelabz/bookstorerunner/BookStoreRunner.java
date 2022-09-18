package com.bridgelabz.bookstorerunner;

import com.bridgelabz.bookstore.BookStore;
import com.bridgelabz.cart.CartList;

import java.util.Scanner;

public class BookStoreRunner {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BookStore bookStore=new BookStore();
        CartList cartList=new CartList(bookStore);
        char repeat='y';
        while (repeat=='y'||repeat=='Y') {
            System.out.println("Enter 1-add book 2-search book by name 3-search book by author 4-delete book name 5-add to cart");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookStore.addBook();
                    break;

                case 2:
                    bookStore.searchBookByName();
                    break;

                case 3:
                    bookStore.searchByAuthor();
                    break;

                case 4:
                    bookStore.deleteBookByName();
                    break;

                case 5:
//                    bookStore.bookToCart();
                    cartList.bookToCart();
                    break;

                default:
                    System.out.println("Invalid choice");

            }
            System.out.println("do you want to continue if yes then type y otherwise press any key");
            repeat=sc.next().charAt(0);

            //bookStore = new BookStore();

            //System.out.println(bookStore.booksList);
            //System.out.println(cartList.bookStore.booksList);
        }

    }
}
