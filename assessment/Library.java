package assessment;

import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private String librarian;
    private int numberEmployees;
    private Book[] books;

    public Library(String name, String address, String librarian, int numberEmployees, Book[] books) {
        setName(name);
        setAddress(address);
        setLibrarian(librarian);
        setNumberEmployees(numberEmployees);
        setBooks(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBookCount(){
        int tot = 0;
        for (Book books:getBooks()) {
            if(books != null) {
                tot += books.getNumberCopies();
            }
        }
        return tot;
    }
    @Override
    public String toString() {
        String output = "";
        output += "Library Details - Name: " + getName() + " Address: " + getAddress() + " Librarian: " + getLibrarian() +
                " Number of Employees: " + getNumberEmployees() + "\n\nBook Details: \n\n";

        for (int i = 0; i < getBooks().length; i++) {
            if(getBooks()[i] != null)
                output += getBooks()[i] + "\n\n";
        }

        output += "\n\n\nLibrary Book Count: " + getBookCount();
        return output;
    }
}
