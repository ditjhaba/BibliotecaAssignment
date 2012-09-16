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
    public void testListMenuOptions(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.menuOptions() > 0);
    }

    @Test
    public void testSelectMenuOption(){
        Biblioteca biblioteca = new Biblioteca(new PrintStream(new ByteArrayOutputStream()));
        assertTrue(biblioteca.selectMenuOption() == true);
    }
}
