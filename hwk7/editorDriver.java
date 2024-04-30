package hwk7;

public class editorDriver {
public static void main(String[] args) {
    Document doc1 = new Document();

    doc1.addChar('E', "Arial", "Red", 12);
    doc1.addChar('T', "Arial", "Red", 14);
    doc1.addChar('H', "Calibri", "Green", 14);
    doc1.addChar('A', "Arial", "Blue", 16);
    doc1.addChar('N', "Calibri", "Blue", 16);

    doc1.save("example1.txt");

    doc1.print();
    }
}
