package patterns.structural.composite.abstract_component;

public abstract class FolderComponent {

    String name;

    boolean isFile;

    public FolderComponent(String name, boolean isFile) {
        this.name = name;
        this.isFile = isFile;
    }

    public void addComponent(FolderComponent folderComponent) {
        throw new UnsupportedOperationException();
    }


    public void removeComponent(FolderComponent folderComponent) {
        throw new UnsupportedOperationException();
    }


    public FolderComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }


    public void print() {
        throw new UnsupportedOperationException(); // папки должны печатать все содержимое
    }


    public String getName() {
        return name;
    }

    public boolean isFile() {
        return isFile;
    }
}