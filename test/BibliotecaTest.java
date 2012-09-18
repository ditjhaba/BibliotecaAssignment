import org.junit.Test;
import org.junit.Assert;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {

    @Test
    public void testPrintMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printMessage();
        assertEquals("Welcome" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintThankYouMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("Thank You! Enjoy the book." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintReservedBookMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("Sorry we don't have that book yet." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintTalkToLibrarianMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("Please talk to Librarian. Thank you." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testSelectMenuOption() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("View Books", os.toString());
    }

    @Test
    public void testViewBooksMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("1. View Books", os.toString());
    }

    @Test
    public void testReserveBookMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("2. Reserve Book", os.toString());
    }

    @Test
    public void testCheckDetailsMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("3. Check User Info", os.toString());
    }

    @Test
    public void testViewBooks() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.viewBooks());
    }

    @Test
    public void testReserveBook() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(false);

        assertTrue(biblioteca.reserveBook(book));
    }

    @Test
    public void testBookReserved() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(true);

        assertFalse(biblioteca.reserveBook(book));
    }

    @Test
    public void testCheckDetails() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.checkDetails());
    }

    @Test
    public void testUserInput(){

    }

}
