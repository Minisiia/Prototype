package prototype;

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

    public Book clone() {
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
