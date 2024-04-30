package hwk7;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Document {
    private ArrayList<Character> characters;

    public Document()
    {
        this.characters = new ArrayList();
    }

    public void save(String filename) {
        try (OutputStream fileOut = Files.newOutputStream(Paths.get(filename));
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String otherFilename) {
        try (InputStream fileIn = Files.newInputStream(Paths.get(otherFilename));
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            this.characters = (ArrayList<Character>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addChar(char character, String font, String color, int size)
    {
        this.characters.add(new Character(character, font, color, size));
    }

    public ArrayList<Character> getCharacters(){
        return this.characters;
    }
    
    public void print(){
        for (Character character : this.characters){
            character.printChar();
        }
    }

}
