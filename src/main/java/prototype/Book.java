package prototype;

import java.util.Objects;

public class Book extends Product{
    private String author;
    private String publisher;
    private String isbn;

    public Book() {
    }

    public Book(int id, String name, String description, double price, String image, String author, String publisher, String isbn) {
        super(id, name, description, price, image);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * При клонировании объектов классов-наследников Book, Movie и Music, происходит создание новых объектов, которые имеют свои собственные копии параметров исходного объекта.
     * Это происходит благодаря переопределению метода clone() в каждом из этих классов и вызову метода super.clone()
     * для создания копии базового объекта и дальнейшему копированию всех параметров, которые необходимы для этого класса.
     * @return A copy of the Book object
     * @throws CloneNotSupportedException if clone is not possible
     */
    @Override
    public Book clone() {
        return (Book) super.clone();
    }
/*    public Book clone() {
        Book cloneBook = new Book();
        cloneBook.setId(this.getId());
        cloneBook.setName(this.getName());
        cloneBook.setDescription(this.getDescription());
        cloneBook.setPrice(this.getPrice());
        cloneBook.setImage(this.getImage());
        cloneBook.setAuthor(this.getAuthor());
        cloneBook.setPublisher(this.getPublisher());
        cloneBook.setIsbn(this.getIsbn());
        return cloneBook;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getIsbn(), book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAuthor(), getPublisher(), getIsbn());
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", image='" + getImage() + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
