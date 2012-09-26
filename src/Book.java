
public class Book {

    private int ISBN;
    private String bookName;
    private String author;
    private boolean isReserved;

    public int getISBN(){
        return ISBN;
    }
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public boolean getReserved(){
        return isReserved;
    }
    public void setReserved(boolean isReserved){
        this.isReserved = isReserved;
    }
}
