class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    // getter-setter

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public Boolean getIsAvailable(){
        return isAvailable;
    }
    public void setIsAvailable(Boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    // is avaiblr true-false
    public void borrowBook(){
        isAvailable = false;
    }
    public void returnBook(){
        isAvailable = true;
    }
}


class Member{
    private String name;
    private String memberId;
    private Book borrowedBooks[] = new Book[5];
    private int numberOfBorrowedBooks;

    public Member(String name, String memberId, Book borrowedBooks[], int numberOfBorrowedBooks) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = borrowedBooks;
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    // getter - setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getNumberOfBorrowedBooks() {
        return numberOfBorrowedBooks;
    }
    public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
        this.numberOfBorrowedBooks = numberOfBorrowedBooks;
    }

    public void borrowBook(Book book){
        if(numberOfBorrowedBooks < borrowedBooks.length){
            borrowedBooks[numberOfBorrowedBooks] = book;
            numberOfBorrowedBooks++;
            book.borrowBook();
        }
        else{
            System.out.println("Cannot borrow more books.");
        }
    }

    public void returnBook(Book book){
        for(int i=0;i<numberOfBorrowedBooks;i++){
            if(borrowedBooks[i] == book){
                borrowedBooks[i] = null;
                numberOfBorrowedBooks--;
                book.returnBook();
                break;
            }
        }
    }

    
}


class Librarian{
    
}



public class LibraryProject {
    public static void main(String[] args) {
        
    }
}
