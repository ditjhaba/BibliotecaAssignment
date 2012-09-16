import java.awt.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

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
        printThankYouMessage();
    }

    public void printMessage() {
          out.println("Welcome");
    }

    public void printThankYouMessage(){
        out.println("Thank You! Enjoy the book.");
    }

    public int menuOptions(){
        menu = new Menu();

        fileMenuItem = new MenuItem("File");
        menu.add(fileMenuItem);
        menu.addSeparator();

        editMenuItem = new MenuItem("Edit");
        menu.add(editMenuItem);
        menu.addSeparator();

        viewMenuItem = new MenuItem("View");
        menu.add(viewMenuItem);

        return menu.countItems();
    }

    public boolean selectMenuOption(){
        return true;
    }

    public boolean viewBooks(){
        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");

        Book book1 = new Book();
        book1.setISBN(2);
        book1.setAuthor("Jules");
        book1.setBookName("Agile");

        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList.add(book1);

        Iterator itr = bookList.iterator();

        out.println("ISBN \t\t| Book \t\t| Author");

        for(int i = 0; i < bookList.size(); i++) {
            out.println();
        }
        return true;
    }
}
