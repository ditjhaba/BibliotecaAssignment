import java.awt.*;
import java.io.PrintStream;

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
    }

    public void printMessage() {
          out.println("Welcome");
    }

    public void ThankYouMessage(){
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
        return true;
    }
}
