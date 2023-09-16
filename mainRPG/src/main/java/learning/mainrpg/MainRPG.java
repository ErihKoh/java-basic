package learning.mainrpg;


public class MainRPG {

    public static void main(String[] args) {
        Unit hero = new Unit("Arthur", 15, 2, 2);
        Unit monster = new Unit("Goblin", 12, 3, 1);
        
        hero.startMove();
        hero.attack(monster, hero);
        
        monster.startMove();
        monster.attack(hero, monster);
        
        monster.startMove();
        hero.defenceState();
        monster.attack(hero, monster);
        
        hero.startMove();
        
        System.out.println("The hero is going through the dungeon"
                + "and steping on a trap");
        hero.takeDamage(3);
        
        hero.startMove();
}
}