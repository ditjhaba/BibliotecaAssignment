import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Biblioteca {

    private PrintStream out;
    private InputStream in;
    private ArrayList<Book> bookList;

    public Biblioteca(PrintStream out, InputStream in) {
        this.out = out;
        this.in = in;
    }

    public static void main(String[] args) {
        new Biblioteca(System.out, System.in).run();
    }

    private void run() {
        printMessage();

        int input;

        do {
            out.println();
            out.println("Menu:");

            viewBooksMenuSelection();
            reserveBookMenuSelection();
            checkDetailsMenuSelection();

            addBooks();

            out.println();

            out.println("Enter the corresponding number from the above menu:");

            input = readUserInput();

            selectMenuOption(input);

        } while (input != 4);
    }

    public int readUserInput() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

            String read = bufferedReader.readLine();
            int selection = Integer.parseInt(read);

            return selection;
        } catch (IOException ioe) {
            out.println("Error: " + ioe.getMessage());
            return 0;
        }
    }

    public void selectMenuOption(int option) {

        switch (option) {
            case 1: {
                viewBooks();
                break;
            }
            case 2: {

                Book book = new Book();
                book.setISBN(1);
                book.setAuthor("Ditjhaba");
                book.setBookName("TWU TDD");
                book.setReserved(false);

                reserveBook(book);
                break;
            }
            case 3: {
                checkDetails();
                break;
            }
            case 4: {
                System.exit(0);
                break;
            }
            default:{
                out.println("Enter correct option!!!!");
            }

        }
    }

    public void addBooks(){
        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(true);

        Book book1 = new Book();
        book1.setISBN(2);
        book1.setAuthor("Jules Perry");
        book1.setBookName("Agile");
        book1.setReserved(false);

        Book book2 = new Book();
        book2.setISBN(3);
        book2.setAuthor("John Terry");
        book2.setBookName("Mingle");
        book2.setReserved(false);

        bookList = new ArrayList<Book>();
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);
    }

    public boolean viewBooks() {

        ListIterator itr = bookList.listIterator();

        out.println("ISBN \t\t\t\t| Book \t\t\t\t\t\t| Author\t\t\t\t\t\t| Available");

        for (int i = 0; i < bookList.size(); i++)
            out.println(bookList.get(i).getISBN() + "\t\t\t\t\t" + bookList.get(i).getBookName() + "\t\t\t\t\t\t" + bookList.get(i).getAuthor() + "\t\t\t\t\t\t" + bookList.get(i).getReserved());

        return true;
    }

    public boolean reserveBook(Book book) {
        printSelectBookMessage();

        int isbn = readUserInput();

        out.print(bookList);

        for (int i = 0; i < bookList.size(); i++){

            if(bookList.get(i).getISBN() == book.getISBN()){

                out.print("ISBN: " + book.getISBN());
                selectBook(book);
            }

        }

        return true;
    }

    public boolean selectBook(Book book){
        if(book.getReserved() == true){
            printReservedBookMessage();
            return false;
        }
        else
        if(book.getReserved() == false){
            printThankYouMessage();
            return true;
        }

        return false;
    }

    public boolean checkDetails() {
        printTalkToLibrarianMessage();
        return false;
    }

    public void printMessage() {
        out.println("Welcome");
    }

    public void printThankYouMessage() {
        out.println("Thank You! Enjoy the book.");
    }

    public void printReservedBookMessage() {
        out.println("Sorry we don't have that book yet.");
    }

    public void printTalkToLibrarianMessage() {
        out.println("Please talk to Librarian. Thank you.");
    }

    public void printSelectBookMessage() {
        out.println("Please enter ISBN Number: ");
    }

    public void viewBooksMenuSelection() {
        out.println("1. View Books");
    }

    public void reserveBookMenuSelection() {
        out.println("2. Reserve Book");
    }

    public void checkDetailsMenuSelection() {
        out.println("3. Check User Info");
    }


}
