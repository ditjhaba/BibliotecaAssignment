import java.awt.*;
import java.io.PrintStream;

public class Biblioteca {

    private PrintStream out;

    public Biblioteca(PrintStream out){
        this.out = out;
    }

    public static void main(String[] args){
        new Biblioteca(System.out).run();
    }

    private void run() {
        printMessage();
    }

    public void printMessage() {
          out.println("Welcome");
    }

    public int menuOptions(){
        Menu menu = new Menu();
        menu.add(new MenuItem("File"));
        menu.addSeparator();
        menu.add(new MenuItem("Edit"));
        menu.addSeparator();
        menu.add(new MenuItem("View"));
        return menu.countItems();
    }

    public boolean selectMenuOption(){
        return true;
    }
}
