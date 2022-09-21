import java.util.Scanner;
class Library_main{
    String []books = new String[10];
    int no_of_books ;
    void addBook( String book){
        books[no_of_books]= book;
        no_of_books++;

    }
    void showAvailableBooks(){
        for(int i = 0; i<books.length;i++){
            if(books[i] == null) {
                continue;
            }
            System.out.println("*"+books[i]);
            }
        }
        void issueBook(String book){
        for(int i = 0; i<books.length; i++){
            if(book == books[i]){
                System.out.println("the "+book+" book is issued:");
                books[i] = null;
                return ;
            }
        }
            System.out.println("the "+book+" book is not there");
        }
    }

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to ADD A BOOK \n press 2 to SHOW AVAILABLE BOOKS\n press 3 to ISSUE A BOOK:");
        int num = sc.nextInt();
        Library_main main = new Library_main();
        if(num == 1){
            System.out.println("enter the book that is to be added:");
            String book = sc.next();
            main.addBook(book);
            System.out.println(book+"is added!");
        }
        else if(num ==2){
            System.out.println("the available books are:");
            main.showAvailableBooks();
        }
        else if(num == 3){
            System.out.println("the book to be issued is/are :");
            main.issueBook("HARRY POTTER");
            main.issueBook("ANNE FRANK");
        }
        else{
            System.out.println("please enter a valid operation!!");
        }
    }
}
