import Battle.Battle;
import Enemies.*;
import Items.*;
import Magics.*;
import Maps.*;
import Players.*;

public class Game {
    public static void main(String[] args) {
        Initial initial = new Initial(5, 12, "up");

        Player player = new Player("Wagner", 50, 10, 10, 10, 1);

        Bat bat = new Bat();
        Battle battle = new Battle(player, bat, initial);
    }
}