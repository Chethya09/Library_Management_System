public class Book {

    private int bookId ;
    private String title ;
    private String author;
    private boolean isIssued ;

    public Book(int bookId ,String title , String author){
        this.bookId = bookId ;
        this.title = title ;
        this.author = author ;
        this.isIssued = isIssued ;
    }

    /* *********************Getter setter ********************* */


    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title ;
    }
    public String getAuthor () {
        return author ;
    }
    public boolean getIsIssued(){
        return isIssued ;
    }


    public void issueBook(){
        isIssued = true ;
    }
    public void returnBook(){
        isIssued = false ;
    }
}
