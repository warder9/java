import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "'}";
    }
}


class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + ", price=" + price + '}';
    }
}


class Bookstore {
    private String name;
    private List<Book> books;

    public Bookstore(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books available at " + name + ":\n");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Arman", "555.doe@email.com");
        Author author2 = new Author("Bob", "123222@email.com");


        Book book1 = new Book("war and peace", author1, 29.99);
        Book book2 = new Book("to kill a mockingbird", author2, 39.99);


        Bookstore bookstore = new Bookstore("MyBookstore");


        bookstore.addBook(book1);
        bookstore.addBook(book2);


        bookstore.displayBooks();
    }
}