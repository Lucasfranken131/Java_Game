import Battle.Battle;
import Enemies.*;
import Items.*;
import Magics.*;
import Maps.*;
import Players.*;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Crauser", 50, 10, 10, 10, 10, 1);
        Initial initial = new Initial(5, 12, "up", player);
    }
}