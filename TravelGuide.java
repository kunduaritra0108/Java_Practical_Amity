// Abstract class
abstract class AbstractProduct {
    int product_id;
    String name;
    String description;

    AbstractProduct(int id, String name, String desc) {
        this.product_id = id;
        this.name = name;
        this.description = desc;
    }

    abstract void display();
}

// Product class
class Product extends AbstractProduct {
    double price;

    Product(int id, String name, String desc, double price) {
        super(id, name, desc);
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
    }
}

// Book class
class Book extends Product {
    String isbn;
    String author;
    String title;

    Book(int id, String name, String desc, double price,
         String isbn, String author, String title) {
        super(id, name, desc, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }
}

// TravelGuide class
class TravelGuide extends Book {
    String country;

    TravelGuide(int id, String name, String desc, double price,
                String isbn, String author, String title, String country) {
        super(id, name, desc, price, isbn, author, title);
        this.country = country;
    }

    void display() {
        super.display();
        System.out.println("Country: " + country);
    }
}

// CD class
class CompactDisc extends Product {
    String artist;
    String title;

    CompactDisc(int id, String name, String desc, double price,
                String artist, String title) {
        super(id, name, desc, price);
        this.artist = artist;
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {

        TravelGuide tg = new TravelGuide(101, "Travel Book", "Guide Book",
                500, "ISBN123", "John Doe", "India Guide", "India");

        CompactDisc cd = new CompactDisc(202, "Music CD", "Audio CD",
                300, "Arijit Singh", "Best Songs");

        System.out.println("---- Travel Guide ----");
        tg.display();

        System.out.println("\n---- Compact Disc ----");
        cd.display();
    }
}