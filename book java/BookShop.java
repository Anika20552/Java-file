
public class BookShop {
private String name;
private Book[] books = new Book[100];


public BookShop() {}
public BookShop(String name) { this.name = name; }


public void setName(String name) { this.name = name; }
public String getName() { return name; }


public boolean insertBook(Book b) {
for (int i = 0; i < books.length; i++) {
if (books[i] == null) {
books[i] = b;
return true;
}
}
return false;
}


public boolean removeBook(Book b) {
for (int i = 0; i < books.length; i++) {
if (books[i] == b) {
books[i] = null;
return true;
}
}
return false;
}


public Book searchBook(String isbn) {
for (Book b : books) {
if (b != null && b.getIsbn().equals(isbn))
return b;
}
return null;
}


public void showAllBooks() {
System.out.println("All Books in BookShop: " + name);
 for (int i = 0; i < books.length; i++) {
    if (books[i] != null) {
        books[i].showDetails();
    }
}

}
}