package Items.Bolsa;
import java.util.HashMap;
import Items.Item;

public class Bag {
    private HashMap<Integer, Integer> bag; // Para Eduardo. o HashMap é o Dictionary do Python, só que mais chato.
    private HashMap<Integer, Item> itemMap; // Mapeia ID do item para o objeto Item correspondente

    public Bag() {
        bag = new HashMap<>();
        itemMap = new HashMap<>();
    }

    public void addItems(Item item, int quantity) {
        int id = item.getId();
        if (bag.containsKey(id)) {
            int currentQuantity = bag.get(id);
            bag.put(id, currentQuantity + quantity);
        } else {
            bag.put(id, quantity);
            itemMap.put(id, item); // Mapeia o ID do item para o objeto Item correspondente
        }
    }

    public void displayItems() {
        System.out.println("Itens na bolsa:");
        for (Integer id : bag.keySet()) {
            Item item = itemMap.get(id); // Obtém o objeto Item correspondente ao ID
            int quantity = bag.get(id);
            System.out.println("Nome: " + item.getName() + ", Quantidade: " + quantity);
        }
    }
}
