import java.awt.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Biblioteca {

    private PrintStream out;
    private Menu menu;
    private MenuItem fileMenuItem;
    private MenuItem editMenuItem;
    private MenuItem viewMenuItem;

    public Biblioteca(PrintStream out){
        this.out = out;
    }

    public static void main(String[] args){
        new Biblioteca(System.out).run();
    }

    private void run() {
        printMessage();
        menuOptions();
        viewBooks();

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(true);
        reserveBook(book);

        Book book1 = new Book();
        book1.setISBN(2);
        book1.setAuthor("Jules");
        book1.setBookName("Agile");
        book1.setReserved(false);
        reserveBook(book1);
    }

    public void printMessage() {
          out.println("Welcome");
    }

    public void printThankYouMessage(){
        out.println("Thank You! Enjoy the book.");
    }

    private void printReservedBookMessage() {
        out.println("Sorry we don't have that book yet.");
    }

    private void printTalkToLibrarianMessage(){
        out.println("Please talk to Librarian. Thank you.");
    }

    public int menuOptions(){
        menu = new Menu();

        fileMenuItem = new MenuItem("View Books");
        menu.add(fileMenuItem);
        menu.addSeparator();

        editMenuItem = new MenuItem("Reserve Book");
        menu.add(editMenuItem);
        menu.addSeparator();

        viewMenuItem = new MenuItem("Check User Info");
        menu.add(viewMenuItem);

        return menu.countItems();
    }

    public void viewBooksMenuSelection(){
        out.println("1. View Books");
    }

    public void reserveBookMenuSelection(){
        out.println("2. Reserve Book");
    }

    public void CheckDetailsMenuSelection(){
        out.println("3. Check User Info");
    }

    public boolean selectMenuOption(){
        return true;
    }

    public boolean viewBooks(){
        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(false);

        Book book1 = new Book();
        book1.setISBN(2);
        book1.setAuthor("Jules");
        book1.setBookName("Agile");
        book1.setReserved(false);

        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList.add(book1);

        ListIterator itr = bookList.listIterator();

        out.println("ISBN \t\t| Book \t\t| Author");

        for(int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getReserved() == false)
                out.println(bookList.get(i).getISBN() + "\t\t\t" + bookList.get(i).getBookName() + "\t\t\t" + bookList.get(i).getAuthor());

        return true;
    }

    public boolean reserveBook(Book book){
        if(book.getReserved() == false){
            book.setReserved(true);
            printThankYouMessage();
            return true;
        }
        else{
            printReservedBookMessage();
            return false;
        }
    }

    public boolean checkDetails(){
        printTalkToLibrarianMessage();
        return false;
    }
}
