public class Main{
    public static void main(String[] args) {
        // Create a few Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310789", 281, 7.69);
        Book book2 = new Book("1984", "George Orwell", "978-0451524935", 328, 7.99);
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769174", 277, 7.49);

        // Set and get properties of Book objects
        book1.setTitle("Go Set a Watchman");
        System.out.println(book1.getTitle()); // Output: "Go Set a Watchman"
        
        System.out.println(book2.toString()); // Output: "1984 by George Orwell"
        
        book3.setPrice(6.99);
        System.out.println(book3.getPrice()); // Output: 6.99
    }
}
