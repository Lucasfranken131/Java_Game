package Players;
import Enemies.Enemy;

public class Player {

    public String name;
    public double HP;
    public int attack;
    public int defense;
    public int mana;
    public int level;

    public Player(String name, double HP, int attack, int defense, int mana, int level) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.mana = mana;
        this.level = level;
    }

    public double getHP() {
        return this.HP;
    }

    public int getAttack() {
        return this.attack;
    }

    public int attackEnemy(Enemy enemy) {
        int attackDamage;
        if(this.attack >= enemy.defense) {
            attackDamage = this.attack * 2 - enemy.defense;
        }
        else {
            attackDamage = this.attack * this.attack / enemy.defense;
        }
        return attackDamage;
    }

    public void playerAttack(Enemy enemy) {
        int dano = this.attackEnemy(enemy);
        enemy.setHP(enemy.HP - dano);
        System.out.println(" ");
        System.out.println(this.name + " deu " + dano + " de dano");
    }

    public void getPlayerStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("Mana: " + this.mana);
    }
    
    public double setHP(double HP){
        return this.HP = HP;
    }
}
