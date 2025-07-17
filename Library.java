import java.util.ArrayList;


public class Library {

    private ArrayList<Book> books = new ArrayList<>() ;

    public Library(){
        super() ;
    }

    public void addBook(Book b ){
        books.add(b) ;
        System.out.println("Book added succesfully ");
    }
    public void removeBook(int bookId ){
        books.removeIf(book -> book.getBookId()== bookId) ;
        System.out.println("Book removed if existed ");
    }

    public void searchBook(String title){
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                book.issueBook();
                System.out.println("Book issued successfully ");
                return ;
            }
        }
        System.out.println("The Book is not present in the library for issue ");
    }

    public void issueBook(int bookId ){
        for(Book b : books){
            if(b.getBookId() == bookId && !b.getIsIssued()){
                b.issueBook();
                System.out.println("Book is issued successfully");
                return ;
            }
        }
    }
    public void returnBook(int bookId ){
        for(Book b : books ){
            b.returnBook();
            System.out.println("Book is returned successfully ");
            return;
        }

        System.out.println("Book is not available for issue  ");

    }

    public void viewAllBooks(){
        for(Book b : books ){

            System.out.println("Book Id : "+b.getBookId()+"\n Book Title :"+b.getTitle()+"\n Name of Author : "+b.getAuthor()) ;
        }
    }



}
