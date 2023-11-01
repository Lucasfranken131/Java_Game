public class Enemy {
    public int HP;
    public int attack;
    public int defense;
    public Player player;

    public Enemy(int HP, int attack, int defense) {
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        return this.attack;
    }

    public int attackEnemy(Player player) {
        int attackDamage = this.attack - player.defense;
        System.out.println(attackDamage);
        return attackDamage;
    }
}
