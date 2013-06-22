 /*	fileName: DungeonCharacter.java
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

   public abstract class DungeonCharacter{
   
      protected String name;
      protected int hp;
      protected int atkSpd;
      protected int minDamage;
      protected int maxDamage;
      protected double hitChance;

   
   
   
   //Default Value constructor
      DungeonCharacter(){
         name = "No Name";
         hp = 1;
         atkSpd = 1;
         minDamage = 13;
         maxDamage = 25;
         hitChance = 0.70;
      }
   
   //Explicit Value Constructor
      DungeonCharacter(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance){
         this.name = "No Name";
         this.hp = hp;
         this.atkSpd = atkSpd;
         this.minDamage = minDmg;
         this.maxDamage = maxDmg;
         this.hitChance = hitChance;
			
 
      }
   
   
		//Determines the number of attacks based on the attacks speed of the user and the opponent
   	public int getNumberAtks(DungeonCharacter monster){
			int temp = this.atkSpd / monster.atkSpd;
			
			if(temp == 0)
				return 1;
			else
				return temp;
		}
   
   
      public abstract void attack(DungeonCharacter character);
  		
		//Hero methods abstracted 	
		//Note: I abstracted this here so that it would be easy to allow
		//			monsters to block later on.
		public abstract boolean canBlock();
		
		
		//Monster methods abstracted
		//Note: I abstracted this here so that it would be easy to allow
		//			monsters to block later on.
		public abstract boolean canHeal();
		public abstract void heal();
		
		
		public int getHP(){
			return this.hp;
		}
   
   
   
	
		//Determines the amount of damage dealt to the input character
      public void attackDamage(DungeonCharacter character){
         Random rand = new Random();
         int damage = (rand.nextDouble() < hitChance ? rand.nextInt(maxDamage - minDamage) + minDamage : 0);
         if( damage > 0){
            System.out.println(this.name + " deals " + damage + " damage to " + character.name + "!");
            character.hp -= damage;
           
			  	//Added measure to garauntee hp doesn't drop below 0
			   if(character.hp < 1){
               character.hp = 0;
            }
         }
         else{
            System.out.println(this.name + "'s attack missed.");
         }
      }
   
   
   
   
   
   
   
   	//Prints out the current status of our contestants 
      public static void healthUpdate(DungeonCharacter hero, DungeonCharacter monster){
   		System.out.println();
			System.out.println("====CURRENT HEALTH====");       
			System.out.println( hero.name + "'s health: " + hero.hp + "hp");
         System.out.println( monster.name + "'s health: " + monster.hp + "hp");
			System.out.println();
      }
   
   
   
   
   
   
   
   
   
   
   	//Returns 	True if character is alive
		//				Flase if Dead
      public boolean isAlive(){
         if(this.hp > 0)
            return true;
         else
            return false;
      }
   
   
   
   
   
   
   
   
   
   
   }