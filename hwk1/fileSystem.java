package hwk1;
import java.util.ArrayList;
import java.util.List;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("File: " + name);
    }
}

class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void print() {
        System.out.println("Folder: " + name);
        System.out.println("Files:");
        for (File file : files) {
            file.print();
        }
        System.out.println("Subfolders:");
        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
    }

    public void delete() {
        for (Folder subFolder : subFolders) {
            subFolder.delete();
        }
        subFolders.clear();
        files.clear();
    }
}

public class fileSystem {
    public static void main(String[] args) {
        // Creating the file system structure
        Folder phpDemo1 = new Folder("php_demo1");
        Folder app = new Folder("app");
        Folder publicFolder = new Folder("public");
        Folder sourceFiles = new Folder("Source Files");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder includePath = new Folder("Include Path");

        File index = new File("index.html");
        File htrouter = new File(".htrouter.php");
        File htaccess = new File(".htaccess");

        phpDemo1.addSubFolder(sourceFiles);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(includePath);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        app.addFile(htaccess);
        app.addFile(htrouter);
        app.addFile(index);

        System.out.println("Initial file system:");
        phpDemo1.print();
        System.out.println();

        System.out.println("Deleting app folder:");
        app.delete();
        phpDemo1.print();
        System.out.println();

        System.out.println("Deleting public folder:");
        publicFolder.delete();
        phpDemo1.print();
    }
}
