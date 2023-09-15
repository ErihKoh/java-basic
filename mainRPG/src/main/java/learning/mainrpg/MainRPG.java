package learning.mainrpg;


public class MainRPG {

    public static void main(String[] args) {
        Unit hero = new Unit("Arthur", 10, 2);
        Unit monster = new Unit("Goblin", 8, 1);
        
        monster.printInfo();
        hero.attack(monster, hero);
        monster.printInfo();
}
}