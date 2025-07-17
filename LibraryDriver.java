import java.util.Scanner;

public class LibraryDriver {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n ===========Library Menu =================");
            System.out.println("1. add book");
            System.out.println("2. remove book");
            System.out.println("3. Search Book");
            System.out.println("4. issue Book");
            System.out.println("5. Return book");
            System.out.println("6. View all book ");
            System.out.println("0. Exit ");
            System.out.println("Choose an option : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id , title , author");
                    int id = sc.nextInt();
                    sc.nextLine() ;
                    String title = sc.nextLine();
                    String author = sc.nextLine();

                    lib.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.println("Enter Book ID to Remove : ");
                    int removeId = sc.nextInt();
                    lib.removeBook(removeId);
                    break;
                case 3:
                    System.out.println("enter the title for the book");
                    String title1 = sc.nextLine();
                    lib.searchBook(title1);
                    break;
                case 4:
                    System.out.println("Enter Book ID to issue : ");
                    int issueId = sc.nextInt();
                    lib.issueBook(issueId);
                    break;
                case 5:
                    System.out.println("Enter book id to return ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 6:
                    lib.viewAllBooks();
                    break;
                case 0:
                    System.out.println("Thank You ");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice ");
            }
        }
    }

}
