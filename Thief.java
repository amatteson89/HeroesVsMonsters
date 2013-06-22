 /*	fileName: Theif.java
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

public class Thief extends Hero{


	Thief(){
		//super requirements
		//(int hp, int atkSpd, int minDmg, int maxDmg, double hitChance, double blockChance)
		super(75, 6, 20, 40, .8, .4, "Surprise Attack");
		
		
// 		hp = 75;
// 		atkSpd = 6;
// 		hitChance = .8;
// 		minDamage = 20;
// 		maxDamage = 40;
// 		blockChance = .4;
	}
	
	
	//SURPRISE ATTACK ABILITY
	public void specialAbility(DungeonCharacter monster){
		double surpriseChance = .4;
		double normalAttackChance = .8;
		Random rand = new Random();
		
		
		double result = rand.nextDouble();
		if(result < surpriseChance){

			System.out.println("You gained an extra attack!");
			super.attackDamage(monster);
			super.attackDamage(monster);
		}
		else if( result < normalAttackChance){
			super.attackDamage(monster);
		}
		else{
			System.out.println("Surprise Attack missed!!");
		}
		
	}



}