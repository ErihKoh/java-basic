package learning.mainrpg;

import java.util.Random;
import java.util.Scanner;

public class MainRPG {
    
    static Scanner scanner;
    static Random random;
    
    static String heroName;
    static int heroHP;
    static int heroAttack;
        
    static String monsterName;
    static int monsterHP;
    static int monsterAttack;

    public static void main(String[] args) {
        
        init();
        
        startingGame();

        while (true) {
        
            heroMove();
        
            printStatistic();
            
            if (monsterHP <= 0) {
                System.out.println("The hero win");
                break;
            }
        
            monsterMove();

            printStatistic();
            
            if (heroHP <= 0) {
                System.out.println("The monster win");
                break;
            }
        
        }
        
        System.out.println("The game ended");
        
    }
    
    public static void printStatistic() {
        System.out.println("===============================================");
        System.out.println("Statictic: ");
        System.out.println("Hero " + heroName + " has HP " + heroHP);
        System.out.println("Monster " + monsterName + " has HP " + monsterHP);
        System.out.println("===============================================");
    }
    
    public static void init() {
        
        scanner = new Scanner(System.in);
        random = new Random();
        
        System.out.println("Enter name your hero");
        
        heroName = scanner.next();
        heroHP = 10;
        heroAttack = 4;
        
        monsterName = "Ork";
        monsterHP = 8;
        monsterAttack = 2;
    }
    
    public static void heroMove() {
        System.out.println("Hero's move");
        
        System.out.println("Select action: 1. Attack, 2. Defend");
        
        int command = scanner.nextInt();
        
        if (command == 1) {
            monsterHP -= heroAttack;
            System.out.println("Monster had damage " + heroAttack);
            
        }
        else if (command == 2) {
            
            heroHP+=1;
            
            System.out.println("The hero had 1 point life");
        }
        else {
            System.out.println("You leave move");
        }
    }
    
    public static void monsterMove() {
        System.out.println("Monster's move");
        int monsterCommand = random.nextInt(2);
            
        if (monsterCommand == 0) {
            System.out.println("Her0 had damage " + monsterAttack);
            heroHP -= monsterAttack;
            
        } else if (monsterCommand == 1) {
            System.out.println("The monster has 1 point life");
            monsterHP += 3;
        }
     
    }
    
    public static void startingGame() {
        System.out.println("The game started");
        
        System.out.println("Hero " + heroName + " has entered in the forest and met the monster " + monsterName + " started figth" );
        
        System.out.println("The figth has started");
    } 
}
