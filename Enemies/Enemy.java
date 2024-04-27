package Enemies;
import Players.Player;

public abstract class Enemy {
    protected int id;
    protected String name;
    protected int HP;
    protected int attack;
    protected int defense;
    protected int speed;
    protected Player player;

    public Enemy(int id, String name,int HP, int attack, int defense, int speed) {
        this.id = id;
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public int attackEnemy(Player player) {
        int attackDamage;
        if(this.attack >=  player.getDefense()) {
            attackDamage = this.attack * 2 - player.getDefense();
        }
        else {
            attackDamage = this.attack * this.attack / player.getDefense();
        }
        return attackDamage;
    }

    public void enemyAttack(Player player, double d) {
        if(this.HP > 0) {
            double dano =  this.attackEnemy(player) * d;
            player.setHP(player.getHP() - dano);
            System.out.println(this.name + " lhe deu " + dano + " de dano");
        }
    }

    public void getEnemyStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println(" ");
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.HP;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int setHP(int HP) {
        this.HP = HP;
        return this.HP;
    }
}
