package assessment;

public class Author {
    private static int authorID;
    private int authorNumber;
    private int counts = 0;
    private String firstname;
    private String surname;

    public Author(String firstname, String surname) {
        setFirstname(firstname);
        setSurname(surname);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
