public class Start {
public static void main(String[] args) {
BookShop bs = new BookShop("AIUB Book Shop");


StoryBook s1 = new StoryBook("002","Fantasy", "Fairy Tales", "Andersen", 250.0, 10, "Fantasy");
StoryBook s2 = new StoryBook("456", "Arabian Nights", "Unknown", 300.0, 8, "Classic");
StoryBook s3 = new StoryBook("476", "Harry Potter", "J K Rowling", 500.0, 15, "Magic");
StoryBook s4 = new StoryBook("987", "The Hobbit", "Tolkien", 450.0, 5, "Adventure");
StoryBook s5 = new StoryBook("395", "Snow White", "Grimm", 200.0, 12, "Kids");


TextBook t1 = new TextBook("678", "Java Programming", "Herbert", 600.0, 20, 12);
TextBook t2 = new TextBook("234", "Physics", "Halliday", 550.0, 18, 11);
TextBook t3 = new TextBook("001", "Chemistry", "Brown", 500.0, 16, 10);
TextBook t4 = new TextBook("987", "Mathematics", "Stewart", 650.0, 14, 12);
TextBook t5 = new TextBook("456", "Biology", "Campbell", 580.0, 10, 9);


bs.insertBook(s1);
 bs.insertBook(s2);
 bs.insertBook(s3);
 bs.insertBook(s4);
 bs.insertBook(s5);
 
bs.insertBook(t1);
 bs.insertBook(t2); 
 bs.insertBook(t3); 
 bs.insertBook(t4);
 bs.insertBook(t5);

bs.showAllBooks();


System.out.println("Searching Book with ISBN S3:");
Book c1 = bs.searchBook("S3");
if (c1 != null) c1.showDetails();


System.out.println("Selling 3 copies of S3");
c1.sellQuantity(3);
c1.showDetails();
}
}