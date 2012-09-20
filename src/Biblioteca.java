import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Biblioteca {

    private PrintStream out;
    private InputStream in;

    public Biblioteca(PrintStream out, InputStream in){
        this.out = out;
        this.in = in;
    }

    public static void main(String[] args){
        new Biblioteca(System.out, System.in).run();
    }

    private void run() {
        printMessage();

        out.println();
        out.println("Menu:");
        viewBooksMenuSelection();
        reserveBookMenuSelection();
        checkDetailsMenuSelection();
        out.println();

        out.println("Enter the corresponding number from the above menu:");

         int input = readUserInput();

        /*viewBooks();

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
        reserveBook(book1);*/
    }

    public int readUserInput() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String read = bufferedReader.readLine();
            int selection = Integer.parseInt(read);

            return selection;
        }
        catch (IOException ioe){
            out.println("Error: " + ioe.getMessage());
            return 0;
        }
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

    public void viewBooksMenuSelection(){
        out.println("1. View Books");
    }

    public void reserveBookMenuSelection(){
        out.println("2. Reserve Book");
    }

    public void checkDetailsMenuSelection(){
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
