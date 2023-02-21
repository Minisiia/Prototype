package prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You are developing a system for managing products in an online store.
 * One of the tasks of the system is to create copies of products for editing or creating new products based on existing ones.
 * You need to implement this functionality using the "Prototype" design pattern.
 * You should create a base class Product(id, name, description, price, image), which will contain common properties and methods for all types of products.
 * Then, create subclasses Book(author, publisher, isbn), Movie(director, actors, duration), and Music(artist, genre, album), which will contain additional properties and methods specific to each type of product.
 * Each class should implement the clone() method, which will create a copy of the object.

 * In the main method, create several objects of each type of product, save them in a collection, and then create copies of objects using the clone() method.
 * When creating copies of objects, you need to change the values of some properties to demonstrate that objects are created based on existing objects.
 *
 * For example, you can create the book "War and Peace" by Leo Tolstoy, save it in the collection, and then create a copy, changing the name to "War and Peace (new edition)" and increasing the price by 10%.
 */
public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Movie> movieList = new ArrayList<>();
        List<Music> musicList = new ArrayList<>();
// Создание объектов Book
        Book book1 = new Book(1, "War and Peace", "A novel by the Russian author Leo Tolstoy, first published in 1869.", 15.99, "https://example.com/images/book1.jpg", "Leo Tolstoy", "Penguin Random House", "9780140447934");
        Book book2 = new Book(2, "To Kill a Mockingbird", "A novel by the American author Harper Lee, published in 1960.", 12.99, "https://example.com/images/book2.jpg", "Harper Lee", "HarperCollins Publishers", "9780061120084");
        Book book3 = new Book(3, "1984", "A dystopian social science fiction novel by English novelist George Orwell.", 10.99, "https://example.com/images/book3.jpg", "George Orwell", "Signet Classics", "9780451524935");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
// Создание объектов Movie
        Movie movie1 = new Movie(1, "The Godfather", "A 1972 American crime film directed by Francis Ford Coppola and produced by Albert S. Ruddy.", 24.99, "https://example.com/images/movie1.jpg", "Francis Ford Coppola", Arrays.asList("Marlon Brando", "Al Pacino", "James Caan"), 175);
        Movie movie2 = new Movie(2, "The Shawshank Redemption", "A 1994 American drama film written and directed by Frank Darabont, based on the 1982 Stephen King novella Rita Hayworth and Shawshank Redemption.", 19.99, "https://example.com/images/movie2.jpg", "Frank Darabont", Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton"), 142);
        Movie movie3 = new Movie(3, "The Dark Knight", "A 2008 superhero film directed, co-produced, and co-written by Christopher Nolan.", 22.99, "https://example.com/images/movie3.jpg", "Christopher Nolan", Arrays.asList("Christian Bale", "Heath Ledger", "Aaron Eckhart"), 152);
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
// Создание объектов Music
        Music music1 = new Music(1, "The Dark Side of the Moon", "The eighth studio album by English rock band Pink Floyd, released on 1 March 1973.", 8.99, "https://example.com/images/music1.jpg", "Pink Floyd", "Progressive rock", "The Dark Side of the Moon");
        Music music2 = new Music(2, "Thriller", "The sixth studio album by American singer Michael Jackson, released on November 30, 1982.", 6.99, "https://example.com/images/music2.jpg", "Michael Jackson", "Pop", "Thriller");
        Music music3 = new Music(3, "Back in Black", "The seventh studio album by Australian rock band AC/DC, released on July 25, 1980.", 7.99, "https://example.com/images/music3.jpg", "AC/DC", "Hard rock", "Back in Black");
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);

        System.out.println("Books list:");
        for (Book temp : bookList) System.out.println(temp);

        System.out.println("Movies list:");
        for (Movie temp : movieList) System.out.println(temp);

        System.out.println("Music list:");
        for (Music temp : musicList) System.out.println(temp);

        Book cloneBook1 =bookList.get(0).clone();
        cloneBook1.setName("War and Peace (new edition)");
        cloneBook1.setPrice(cloneBook1.getPrice() * 1.1);
        bookList.add(cloneBook1);

        System.out.println("New books list:");
        for (Book temp : bookList) System.out.println(temp);

    }
}
