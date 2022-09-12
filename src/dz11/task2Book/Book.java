package dz11.task2Book;

import java.util.Scanner;


public class Book {
    public Book(String title, String author, String content) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input book's title : ");
        Title title1 = new Title(scanner.nextLine());

        System.out.print("Input book's author : ");
        Author author1 = new Author(scanner.nextLine());


        System.out.print("Input book's content : ");
        Content content1 = new Content(scanner.nextLine());

        Book book1 = new Book(title1.getTitle(), author1.getAuthor(), content1.getContent());
        title1.show();
        author1.show();
        content1.show();
    }
}
