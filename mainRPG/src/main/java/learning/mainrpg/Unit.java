package learning.mainrpg;


public class Unit {
    String name;
    int hp;
    int attack;
    float critAttackChance;
    
    public Unit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.critAttackChance = 0.5f;
    }
    
    public void attack(Unit target, Unit name) {
        System.out.println(name.name + " attacked");
        target.takeDamage(name.attack);;
        
        if (Math.random() <= critAttackChance) {
            target.takeDamage(name.attack);
            System.out.println(target.name + " took critic damage");
        }
    }
    
    public void defence() {
        System.out.println(name + " defenced");
    }
    
    public void takeDamage(int amount) {
        hp -= amount;
    }
    
    public void printInfo() {
        System.out.println(name + " HP: " + hp + " ATACK: " + attack);
    }
}
