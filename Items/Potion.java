package Items;

public class Potion extends Item {

    static int id = 1;
    static String name = "Poção";
    static String type = "Cura";
    static int price = 10; // O price é preço para se comprar, para vender vou fazer price = price - price * 0.20.

    public Potion() {
        super(id, name, type, price);
    }
}