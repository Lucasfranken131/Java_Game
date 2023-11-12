import Battle.Battle;
import Enemies.*;
import Items.*;
import Magics.*;
import Maps.*;
import Players.*;

public class Game {
    public static void main(String[] args) {
        Map mapa = new Map(1, 1, "Initial", "up");
        Player player = new Player("Jorge", 50, 10, 10, 10, 1);

        Bat bat = new Bat();
        Battle battle = new Battle(player, bat, mapa);
    }
}