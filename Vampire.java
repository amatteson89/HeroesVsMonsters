  /*	fileName: Vampire.java
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

   public class Vampire extends Hero{
   
   	
   
      Vampire(){
      //super requirements
      //(int hp, int atkSpd, int minDmg, int maxDmg, double hitChance, double blockChance)
      
         super(120, 4, 15, 60, .65, .15, "Suck Blood");
      
      // 		hp = 75;
      // 		atkSpd = 5;
      // 		hitChance = .7;
      // 		minDamage = 25;
      // 		maxDamage = 45;
      // 		blockChance = .3;
      }
   
   
   //Suck Blood ABILITY
   //Deals a random amount of damage between minSuck and maxSuck
   //Heals the vampire for that amounts
   //Deals that much damage to opponent
      public void specialAbility(DungeonCharacter monster){
         int minSuck = 10;
         int maxSuck = 25;
         Random rand = new Random();
      
         int vamp = rand.nextInt(maxSuck - minSuck) + minSuck;
      
         this.hp += vamp;
         monster.hp -= vamp;
      	
       	//Added measure to garauntee hp doesn't drop below 0
         if(monster.hp < 1){
            monster.hp = 0;
         }
      	
      	
         System.out.println("You suck " + vamp + " hp from " + monster.name + "!");
      }
   
   }