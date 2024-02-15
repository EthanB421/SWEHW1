package hwk1;

public class courseDriver {
    public static void main(String[] args) {
        instructor brandon = new instructor("Brandon", "Luis", "321");
        instructor ethanB = new instructor("Ethan", "Bautista", "123");
        textbook book = new textbook("Computer Book", "David", "CPP");
        textbook book2 = new textbook("Cooler Book", "John", "CPP");
        course swe = new course("Software Engineering", ethanB, book);
        course coolClass = new course("How to be cool", brandon, book2);
        swe.print();

        coolClass.print();
    }
}
