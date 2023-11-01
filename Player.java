public class Player {

    public String name;
    public int HP;
    public int attack;
    public int defense;

    public Player(String name, int HP, int attack, int defense) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
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
        System.out.println(this.name + " deu " + attackDamage + " de dano");
        return attackDamage;
    }
    
}
