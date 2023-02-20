package prototype;

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

    }
}
