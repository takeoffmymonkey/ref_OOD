package patterns.structural.composite.concrete_leaf;

import patterns.structural.composite.abstract_component.FolderComponent;

public class File extends FolderComponent {

    public File(String name) {
        super(name, true);
    }

    @Override
    public void print() {
        System.out.println("File: " + getName());
    }
}