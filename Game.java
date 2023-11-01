public class Game {
    public static void main(String[] args) {
        Player player = new Player("Lucas", 200, 30, 15);
        Bat bat = new Bat(50, 50, 10);
        player.attackEnemy(bat);
    }
}