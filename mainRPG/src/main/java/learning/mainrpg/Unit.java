package learning.mainrpg;


public class Unit {
    private String name;
    private int hp;
    private int hpMax;
    private int attack;
    private int defence;
    private float critAttackChance;
    private boolean defState;
    
    public Unit(String name, int hpMax, int attack, int defence) {
        this.name = name;
        this.hpMax = hpMax;
        this.hp = this.hpMax;
        this.attack = attack;
        this.defence = defence;
        this.critAttackChance = 0.5f;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void attack(Unit target, Unit name) {
        System.out.println(name.name + " attacked");
        int actualAttack = name.attack;
        
        if (Math.random() <= critAttackChance) {
            actualAttack *= 2;
            System.out.println(target.name + " took critic damage " + 
                    actualAttack);
        }
        
        int resultAttackAmount = target.takeDamage(actualAttack);
        
        System.out.println("Character " + target.name + " took" + 
                resultAttackAmount + " damage");
        target.printInfo();
    }
    
    public void defenceState() {
        defState = true;
        System.out.println(name + " defenced");
    }
    
    public void startMove() {
        System.out.println("");
        System.out.println("Character " + name + " is moving");
        printInfo();
        defState = false;
    }
    
    public int takeDamage(int amount) {
        int actualDefence = defence;
        if (defState) actualDefence *= 1.5f;
        amount -= actualDefence;
        if (amount < 0) amount = 0;
        hp -= amount;
        return amount;
    }
    
    public void cure(int amount) {
        hp += amount;
        if (hp > hpMax) hp = hpMax;
    }
    
    public void printInfo() {
        System.out.println("=======================================");
        System.out.println(name + " HP: " + hp + "/" + hpMax + " ATACK: " 
                + attack + " defState: " + defState);
        System.out.println("========================================");
    }
}
