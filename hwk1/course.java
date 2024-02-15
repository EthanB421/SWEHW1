package hwk1;

    class instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class textbook{
    private String title;
    private String author;
    private String publisher;

    public textbook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

public class course{
    private String courseName;
    private instructor instructors;
    private textbook textbooks;
    
    public course(String courseName, instructor instructors, textbook textbooks)
    {
        this.courseName = courseName;
        this.instructors =  instructors;
        this.textbooks = textbooks;
    }

    public void print(){
        System.out.println("Instructor: "+instructors.getFirstName()+" "+instructors.getLastName()+" textbook used: "+textbooks.getTitle()+ " by "+textbooks.getAuthor());
    }
    
}

