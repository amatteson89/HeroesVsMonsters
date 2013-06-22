 /*	fileName: Ogre.java
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

public class Ogre extends Monster{



	Ogre(){
	//super requirements 
		//(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance,
		//	double healChance, int minHealHP, int maxHealHP)
		super(200, 2, 30, 60, .6, .1, 30, 60, "Ogre");
		
// 		hp = 200;
// 		atkSpd = 2;
// 		hitChance = .6;
// 		minDamage = 30;
// 		maxDamage = 60;
// 		healChance = .1;
// 		minHealHP = 30;
// 		maxHealHP = 60;
	
	
	}


	 public  void specialAttack(DungeonCharacter hero){
	 	//Deadly burp
		System.out.println("Ogre special attack!");
		System.out.println("Ogre lets out a deady burp halfing your life");
		hero.hp = hero.hp / 2;
	 }




	//Added this as a possible add-on later. Currently unused
	public boolean canBlock(){return false;}

}