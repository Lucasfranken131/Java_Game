import Battle.Battle;
import Enemies.*;
import Items.*;
import Magics.*;
import Maps.*;
import Players.*;

public class Game {
    public static void main(String[] args) {
        Initial initial = new Initial(5, 12, "up");
        initial.showMap();

        Player player = new Player("Jorge", 50, 10, 10, 10, 1);

    }
}