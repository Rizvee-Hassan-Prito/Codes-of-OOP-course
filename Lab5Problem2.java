
package lab5problem2;

import java.util.Scanner;

public class Lab5Problem2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Book[] bookArray = new Book[5];
        for (int i = 0; i < 5; i++) {

            bookArray[i] = new Book();
            bookArray[i].setISBN(input.nextInt());
            input.nextLine();
            bookArray[i].setBookTitle(input.nextLine());
            bookArray[i].setNumberOfPages(input.nextInt());
            displayAll(bookArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(bookArray[i].compareTo(bookArray[i + 1]));
            System.out.println();
            System.out.println(isHeavier(bookArray[i]));
        }
        System.out.println(isHeavier(bookArray[4]));
    }

    static void displayAll(Book b) {

        System.out.println(b.getISBN() + " " + b.getBookTitle() + " " + b.getNumberOfPages());
    }

    static boolean isHeavier(Book b) {
        if (b.getNumberOfPages() > 500) {
            return true;
        } else {
            return false;
        }
    }

}

class Book {

    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count = 0;

    Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    Book() {

    }

    public String toString() {
        String bookInformation = this.ISBN + " " + this.bookTitle + " " + this.numberOfPages;

        return bookInformation;
    }

    int compareTo(Book I) {
        if (this.numberOfPages > I.numberOfPages) {
            return 1;
        } else if (this.numberOfPages == I.numberOfPages) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int getCount() {
        count++;
        return count;
    }

    public void setNumberOfPages(int numberOfPages) {

        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setBookTitle(String bookTitle) {

        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setISBN(int ISBN) {

        this.ISBN = ISBN;
    }

    public int getISBN() {
        return this.ISBN;
    }

}
