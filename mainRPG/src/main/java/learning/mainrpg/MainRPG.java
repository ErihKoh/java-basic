package learning.mainrpg;

import java.util.Random;
import java.util.Scanner;

public class MainRPG {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Enter name your hero");
        
        String heroName = scanner.next();
        int heroHP = 10;
        int heroAttack = 4;
        
        String monsterName = "Ork";
        int monsterHP = 8;
        int monsterAttack = 2;
        
        System.out.println("The game started");
        
        System.out.println("Hero " + heroName + " has entered in the forest and met the monster " + monsterName + " started figth" );
        
        System.out.println("The figth has started");
        
//        The hero is moving
        while (true) {
            System.out.println("Hero's move");
        
        System.out.println("Select action: 1. Attack, 2. Defend");
        
        int command = scanner.nextInt();
        
        if (command == 1) {
            monsterHP -= heroAttack;
            System.out.println("Monster had damage " + heroAttack);
            if (monsterHP <= 0) {
                System.out.println("The hero win");
                break;
            }
        }
        else if (command == 2) {
            
            heroHP+=1;
            
            System.out.println("The hero had 1 point life");
        }
        else {
            System.out.println("You leave move");
        }
        
        System.out.println("Hero " + heroName + " has HP " + heroHP);
        System.out.println("Monster " + monsterName + " has HP " + monsterHP);
        
//        The monster is moving

        System.out.println("Monster's move");
        int monsterCommand = random.nextInt(2);
            
        if (monsterCommand == 0) {
            heroHP -= monsterAttack;
            if (heroHP <= 0) {
                System.out.println(monsterName + " win");
                break;
            }
        } else if (monsterCommand == 1) {
            System.out.println("The monster has 1 point life");
            monsterHP += 3;
        }
     
        
        if (heroHP <= 0) {
            System.out.println("The monster win");
            break;
        }
        System.out.println("=========================================");
        System.out.println("Hero " + heroName + " has HP " + heroHP);
        System.out.println("Monster " + monsterName + " has HP " + monsterHP);
        System.out.println("===============================================");
        }
        
        System.out.println("The game ended");
        
    }
}
