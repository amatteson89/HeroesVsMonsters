  /*	fileName: Sorceress.java
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
 
   import java.util.Random;
   import java.util.Scanner;

   public class Sorceress extends Hero{
   
   	
   
      Sorceress(){
      //super requirements
      //(int hp, int atkSpd, int minDmg, int maxDmg, double hitChance, double blockChance)
      
         super(75, 5, 25, 45, .7, .3, "Heal");
      
      // 		hp = 75;
      // 		atkSpd = 5;
      // 		hitChance = .7;
      // 		minDamage = 25;
      // 		maxDamage = 45;
      // 		blockChance = .3;
      }
   
   
   //HEAL ABILITY
      public void specialAbility(DungeonCharacter monster){
         int minHeal = 10;
         int maxHeal = 50;
         Random rand = new Random();
      
         int heal = rand.nextInt(maxHeal - minHeal) + minHeal;
      
         System.out.println("You heal yourself for " + heal + " hp");
         this.hp += heal;
      }
   
   
   
   
   
   }