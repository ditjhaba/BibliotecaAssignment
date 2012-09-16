import org.junit.Test;
import org.junit.Assert;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {

    @Test
    public void testPrintMessage(){
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printMessage();
        assertEquals("Welcome" + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testPrintThankYouMessage(){
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        new Biblioteca(new PrintStream(os)).printThankYouMessage();
        assertEquals("Thank You! Enjoy the book." + System.getProperty("line.separator"), os.toString());
    }

    @Test
    public void testListMenuOptions(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.menuOptions() > 0);
    }

    @Test
    public void testSelectMenuOption(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.selectMenuOption() == true);
    }

    @Test
    public void testViewBooks(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.viewBooks());
    }

    @Test
    public void testReserveBook(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));

        Book book = new Book();
        book.setISBN(1);
        book.setAuthor("Ditjhaba");
        book.setBookName("TWU TDD");
        book.setReserved(false);

        assertTrue(biblioteca.reserveBook(book));
    }

    @Test
    public void testBookReserved(){

    }
}
