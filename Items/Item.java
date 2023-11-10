package Items;

public abstract class Item {
    int id;
    String name;
    String type;
    int value;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
