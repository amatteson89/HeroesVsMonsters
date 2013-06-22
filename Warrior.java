 /*	fileName: Warrior.java
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


public class Warrior extends Hero{




	Warrior(){
		//super requirements
		//(int hp, int atkSpd, int minDmg, int maxDmg, double hitChance, double blockChance)
		super(125, 4, 35,60,.8, .2, "Crushing Blow" );
		
// 		hp = 125;
// 		atkSpd = 4;
// 		minDamage = 35;
// 		maxDamage = 60;
// 		hitChance = .8;
// 		blockChance = .2;
	}
	
	//CRUSHING BLOW ABILITY
	public void specialAbility(DungeonCharacter monster){
		Random rand = new Random();
		double crushingChance = .40;
		
		if(rand.nextDouble() < crushingChance){
			int damage = rand.nextInt(100) + 75;
			System.out.println("Crushing blow hit! You deal " + damage + " damage");
			monster.hp -= damage;
			
			if(monster.hp < 1)
				monster.hp = 0; 
		}
		else{
			System.out.println("Crushing blow missed");
		}
		
	}


}