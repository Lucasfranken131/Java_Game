public class Player {

    public String name;
    public int HP;
    public int attack;
    public int defense;
    public int level;

    public Player(String name, int HP, int attack, int defense, int level) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
    }

    public int getHP() {
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
    
    public void setHP(int HP){
        this.HP = HP;
    }
}
