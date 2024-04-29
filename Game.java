import Battle.Battle;
import Enemies.*;
import Items.*;
import Items.Bolsa.Bag;
import Magics.*;
import Maps.*;
import Players.*;

public class Game {
    public static void main(String[] args) {
        Bag bolsa = new Bag();
        Potion potion = new Potion();
        bolsa.addItems(potion, 50);
        Player player = new Player("Crauser", 50, 10, 10, 10, 10, 1, bolsa);
        Initial initial = new Initial(5, 12, "up", player);
    }
}