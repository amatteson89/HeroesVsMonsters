 /*	fileName: dungeonTester.java
 *
 *		author: Andrew Matteson
 *		date: 10/20/12
 *		compiler: jGRASP 1.8.8_20
 *
 *		Heroes vs. Monsters
 *		CSCD 211
 *		Java II
 *
 *		-> worked alone <-
 *		
 *		Extra Credit Attempted:
 *				->>>Extra Hero: yes
 *				->>>Monster Skill: yes
 *				->>>JavaDoc: No
 */
 
 
 
   import java.util.Scanner;

   public class dungeonTester{
   
      public static void main(String[] args){
         DungeonCharacter monster;
         DungeonCharacter hero;
         
      	
         System.out.println("Welcome to Heroes vs. Monsters");
      	
         while(true){
         //Setup our players and monsters
            hero = Hero.heroChoose();
            monster = Monster.generateMonster();
         
         
            System.out.println();
            System.out.println();
            System.out.println("You go first!");
         
         
         //BATTLE LOOP
         //====================================
            while(true){
            //This variable is a pre-battle indicator
             
               int numAttacks = hero.getNumberAtks(monster);
               
               while(numAttacks > 0){
                  int tempMobHP = monster.getHP(); 
               
               
               //Update user on the number of attacks left
                  System.out.println();
                  System.out.println("Number of attacks left: " + numAttacks);
               
               //Hero attacks monster
                  hero.attack(monster);
               	
                  if(!monster.isAlive()){
                     break;
                  }
               //Update numAttacks
                  numAttacks--;
               
               
               //if monster was damaged and not dead, check for heal
                  if(tempMobHP > monster.getHP() && monster.hp != 0){
                     if(monster.canHeal()){
                        monster.heal();
                     }
                  
                  }
               
                  if(numAttacks > 0)
                     DungeonCharacter.healthUpdate(hero,monster);
               
               }
            	
            	
            //Checks to see if they hero blocks the monster
            //if not, the monster attacks
               if(hero.canBlock()){
                  System.out.println(hero.name + " blocked " +  monster.name +"'s attack!");
               } 
               else{
               //Monster can't attack if it is dead
                  if(monster.getHP() > 0){
                     monster.attack(hero);
                  }
               }    	
            
            //Updates user on health statuses
               DungeonCharacter.healthUpdate(hero, monster);
            	
               if(!hero.isAlive() || !monster.isAlive())
                  break;
            	
               Scanner keyboard = new Scanner(System.in);
               System.out.println("Would you like to quit? (y/n)");
               String quit = keyboard.nextLine();
               if(quit.equals("y")){
                  break;
               }
            }
         //=========================================
         //END BATTLE LOOP
         	
         	
         	
         	//DECLARE VICTOR
            if(monster.isAlive())
               System.out.println( monster.name + " wins!!");
            
            else if(hero.isAlive())
               System.out.println( hero.name + " wins!!" );
            
         	
         	
         	
         	//REPLAY GAME QUESTION
         	
            Scanner keyboard = new Scanner(System.in);
            String answer;
            while(true){
               System.out.println("Would you like to play again? (y/n)");
               answer = keyboard.nextLine();
               if( answer.equals("y") || answer.equals("n")){
                  break;
               }
               System.out.println("Invalid choice, choose again");
            }
            if(answer.equals("n")){
               System.out.println("THANKS FOR PLAYING!!!");
               break;
            }
         }	
         	
         
         
      	
      
      
      
      
      
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   }