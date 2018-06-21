package patterns.structural.composite.concrete_node;

import patterns.structural.composite.abstract_component.FolderComponent;

import java.util.ArrayList;

public class Folder extends FolderComponent {

    private ArrayList<FolderComponent> folderComponents;


    public Folder(String name) {
        super(name, false);
        folderComponents = new ArrayList<>();
    }


    @Override
    public void addComponent(FolderComponent folderComponent) {
        folderComponents.add(folderComponent);
    }


    @Override
    public void removeComponent(FolderComponent folderComponent) {
        folderComponents.remove(folderComponent);
    }


    @Override
    public FolderComponent getChild(int i) {
        return folderComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("Folder: " + getName());

        if (folderComponents.size() > 0) {
            System.out.println("Contains: ");
            for (FolderComponent folderComponent : folderComponents) {
                folderComponent.print();
            }
        }
    }
}