package com.bootcoding.java.coupling.book;

public class BookApplication{
    public static void main(String[] args) {
        Author author = new Author();
        author.name="Bootcoding";
        author.education="B.Tech cse";
        author.phone = 9552422909L;

        Book book = new Book();
        book.title="Backend development -JAVA edition";
        book.publisher="Navneet";
        book.price=500;
        book.author=author;

        System.out.println("Book title:" + book.title);
        System.out.println("Book publisher:" + book.publisher);
        System.out.println("Book Price:" + book.price);
        System.out.println("Book Author's name:" + book.author.name);
        System.out.println("Book Author's Education:" + book.author.education);
        System.out.println("Book Author's phone:" + book.author.phone);
    }
}
