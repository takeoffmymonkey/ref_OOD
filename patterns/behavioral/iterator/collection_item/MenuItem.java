package patterns.behavioral.iterator.collection_item;


/* ПРОСТО ОБЪЕКТ ДЛЯ ХРАНЕНИЯ В КОЛЛЕКЦИЯХ */


public class MenuItem {
    String name;
    double price;


    public MenuItem(String description, double price) {
        this.name = description;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }
}
