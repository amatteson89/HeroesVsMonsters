 /*	fileName: Skeleton.java
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


public class Skeleton extends Monster{

	Skeleton(){
		//super requirements 
		//(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance,
		//	double healChance, int minHealHP, int maxHealHP)
		super(100, 3, 30, 50, .8, .3, 30, 50, "Skeleton");
	
// 		hp = 100;
// 		atkSpd = 3;
// 		hitChance = .8;
// 		minDamage = 30;
// 		maxDamage = 50;
// 		healChance = .3;
// 		minHealHP = 30;
// 		maxHealHP = 50;
	}


	 public  void specialAttack(DungeonCharacter hero){
	 	//Bone Toss
		System.out.println("Skeleton special attack!");
		System.out.println("Skeleton takes out one of his ribs and tosses it at you!");
		System.out.println("Bone deals 50 HP!!");
		hero.hp -= 50;
		
		//Makes sure the hero's hp doesn't drop below 0
		if(hero.hp < 1)
			hero.hp = 0;
	 }
	
	
	

	//Added this as a possible add-on later. Currently unused
		public boolean canBlock(){return false;}
}