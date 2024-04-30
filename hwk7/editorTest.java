package hwk7;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class editorTest {


    @Test
    public void testSaveAndLoad() {
        Document doc1 = new Document();
        doc1.addChar('C', "Arial", "Blue", 16);
        doc1.addChar('D', "Calibri", "Green", 18);
        doc1.save("test_document.txt");


        assertEquals(2, doc1.getCharacters().size());
        assertEquals('C', doc1.getCharacters().get(0).getCharacter());
        assertEquals("Arial", doc1.getCharacters().get(0).getFont().getFont());
        assertEquals("Blue", doc1.getCharacters().get(0).getColor().getColor());
        assertEquals(16, doc1.getCharacters().get(0).getSize().getSize());
        assertEquals('D', doc1.getCharacters().get(1).getCharacter());
        assertEquals("Calibri", doc1.getCharacters().get(1).getFont().getFont());
        assertEquals("Green", doc1.getCharacters().get(1).getColor().getColor());
        assertEquals(18, doc1.getCharacters().get(1).getSize().getSize());
    }

    @Test
    public void testPrint() {
        Document doc = new Document();
        doc.addChar('A', "Arial", "Black", 12);
        doc.addChar('B', "Calibri", "Red", 14);

        final String printedOutput = captureOutput(() -> doc.print());

        assertTrue(printedOutput.contains("Character: A| Font: Arial | Color: Black | Font size: 12"));
        assertTrue(printedOutput.contains("Character: B| Font: Calibri | Color: Red | Font size: 14"));
    }

    private String captureOutput(Runnable code) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        code.run();

        System.setOut(System.out);

        return out.toString();
    }

}
