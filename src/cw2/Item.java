package cw2;

public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Name:" + name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
