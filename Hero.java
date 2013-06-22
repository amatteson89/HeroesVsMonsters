 /*	fileName: Hero.java
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
	import java.util.Random;

   public abstract class Hero extends DungeonCharacter{
   
   
      protected double blockChance;
      protected String specialName;
   
   
   
   //Explicit Value constructor
      Hero(int hp, int atkSpd, int minDmg, int maxDmg, double hitChance, double blockChance, String specialName){
      //super requirements
      //	(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance)
         super(hp, atkSpd, minDmg, maxDmg, hitChance);
      
      
         this.name = chooseName();
         this.blockChance = blockChance;
         this.specialName = specialName;
      }
   
	

		//prompts the user to input a name
      public static String chooseName(){
         Scanner keyboard = new Scanner(System.in);
         System.out.println("What will the name of your Hero be: ");
         String tempName = keyboard.nextLine();
         return tempName;
      }
   
	
	
      public abstract void specialAbility(DungeonCharacter monster);
   

   
		//Determines if the user can block
		public boolean canBlock(){
			Random rand = new Random();
			
			if(rand.nextDouble() > this.blockChance)
				return false;
			else
				return true;
			
		}
	
	
	
	
	
   	@Override
      public void attack(DungeonCharacter monster){
         Scanner keyboard = new Scanner(System.in);
         int choice = 0;
         boolean switchBool = false;
      
      
         do{
				System.out.println();
            System.out.println("Choose an attack");
            System.out.println("1) Attack");
            System.out.println("2) " + this.specialName); 
            choice = keyboard.nextInt();
				keyboard.nextLine();
         
            switch(choice){
               case 1:
                  super.attackDamage(monster);
                  break;
               case 2:
                  specialAbility(monster);
                  break;
               default:
                  System.out.println( "Not a valid choice");
                  break;
            }
         }while(switchBool);
      }
   
   
		
		
		//Need to make Theifs special Ability to call
		//	the attackDamage mehtod in super class DungeonCharacter
		public void AttackDamage(DungeonCharacter monster){
			super.attackDamage(monster);
		}
	
   
   
      public static DungeonCharacter heroChoose(){
         Scanner keyboard = new Scanner(System.in);
         
         do{
            
            System.out.println("Choose your hero:");
            System.out.println("1. Warrior");
            System.out.println("2. Thief ");
            System.out.println("3. Sorceress");
				System.out.println("4. Vampire");
         
            int choice = keyboard.nextInt();
            switch(choice){
               case 1:
                  System.out.println("You chose Warrior");	
                  return new Warrior();
               case 2:
                  System.out.println("You chose Thief");
                  return new Thief();
               case 3:
                  System.out.println("You chose Sorceress");
                  return new Sorceress();
     				case 4:
						System.out.println("You chose Vamprie");
						return new Vampire();          
					default:
                  System.out.println("You didn't choose a valid option");
                  break;
            
            }
         }while(true);
      }
   
   
   
   
   
	
	//compiler got made I didn't override this metho
	public void heal(){}
	public boolean canHeal(){ return false;}
   
   
   }