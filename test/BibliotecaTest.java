import org.junit.Test;
import org.junit.Assert;

import java.awt.*;
import java.io.*;

import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void testPrintMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).printMessage();
        assertEquals("Welcome" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintThankYouMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).printThankYouMessage();
        assertEquals("Thank You! Enjoy the book." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintReservedBookMessage() throws Exception{

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).printReservedBookMessage();
        assertEquals("Sorry we don't have that book yet." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintTalkToLibrarianMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).printTalkToLibrarianMessage();
        assertEquals("Please talk to Librarian. Thank you." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testSelectBookMessage() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).printSelectBookMessage();
        assertEquals("Please enter ISBN Number: " + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testViewBooksMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).viewBooksMenuSelection();
        assertEquals("1. View Books" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testReserveBookMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).reserveBookMenuSelection();
        assertEquals("2. Reserve Book" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testCheckDetailsMenuSelection() throws Exception{
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os), new ByteArrayInputStream(new byte[]{})).checkDetailsMenuSelection();
        assertEquals("3. Check User Info" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testViewBooks() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));
        assertTrue(biblioteca.viewBooks());
    }

    @Test
    public void testReserveBook() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(false);

        assertTrue(biblioteca.reserveBook());
    }

    @Test
    public void testBookReserved() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(true);

        assertFalse(biblioteca.reserveBook());
    }

    @Test
    public void testCheckDetails() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));
        assertTrue(biblioteca.checkDetails());
    }

    @Test
    public void testReadUserInput() throws Exception{

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("1".getBytes());
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), byteArrayInputStream);

        assertEquals(1, biblioteca.readUserInput());
        assertEquals(2, biblioteca.readUserInput());
        assertEquals(3, biblioteca.readUserInput());
        assertEquals(4, biblioteca.readUserInput());
    }

    @Test
    public void testSelectBook() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));

        assertTrue(biblioteca.selectBook(new Book()));
    }

    @Test
    public void testAddBooks() throws Exception{
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()), new ByteArrayInputStream(new byte[]{}));

    }

}
