
public class Book {

    private int ISBN;
    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    private String bookName;
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    private String author;
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    private boolean isBooked;
    public boolean getIsBooked(){
        return isBooked;
    }
    public void setAuthor(boolean isBooked){
        this.isBooked = isBooked;
    }
}
