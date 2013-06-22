 /*	fileName: Monster.java
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


   public abstract class Monster extends DungeonCharacter{
   
   
      protected double healChance;
      protected int minHealHP;
      protected int maxHealHP;
      protected double specialAttackChance = .15;
   
   
      Monster(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance,
      	double healChance, int minHealHP, int maxHealHP, String name){
      
      //super requirements
      //(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance)
         super(hp,atkSpd,minDmg,maxDmg,hitChance);
      
         this.healChance = healChance;
         this.minHealHP = minHealHP;
         this.maxHealHP = maxHealHP;
         this.name = name;
      }
   
   
   	//Determines if  the monster can heal
      public boolean canHeal(){
         Random rand = new Random();
         if( rand.nextDouble() > this.healChance)
            return false;
         else
            return true;
      	
      }
   	
   	
   	
   	//heals 
      public void heal(){
         Random rand = new Random();
         int heal = rand.nextInt(maxHealHP - minHealHP) + minHealHP;
         this.hp += heal;
         System.out.println( this.name + " healed for " + heal + " hp.");
      }
   
    
    
    public abstract void specialAttack(DungeonCharacter hero);
    
      public void attack(DungeonCharacter hero){
         Random rand = new Random();
         
      	      	
      	if( rand.nextDouble() > specialAttackChance){
      		super.attackDamage(hero);
      	}
      	else{
      		specialAttack(hero);
      	}
      }
   
   
   
       //Generates a random monster
      public static Monster generateMonster(){
      
         Random rand = new Random();
      
         while(true){
            switch(rand.nextInt(3) + 1){
               case 1:
                  System.out.println("You are fighting a Gremlin");
                  return new Gremlin();
               case 2:
                  System.out.println("You are fighting a Skeleton");
                  return new Skeleton();
               case 3:
                  System.out.println("You are fighting Ogre");
                  return new Ogre();
            }
         }
      }
   
   
   
   }