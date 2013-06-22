import java.util.Random;



public class Gremlin extends Monster{

	//Super :: DungeonCharacter(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance)


	Gremlin(){
		//super requirements 
		//(int hp, int atkSpd,int minDmg, int maxDmg, double hitChance,
		//	double healChance, int minHealHP, int maxHealHP)
		
		super(70,5,15,30,.8, .4, 20, 40,"Gremlin");
		
// 		hp = 70;
// 		atkSpd = 5;
// 		hitChance = .8;
// 		minDamage = 15;
// 		maxDamage = 30;
// 		healChance = .4;
// 		minHealHP = 20;
// 		maxHealHP = 40;
	}
	
	
	 public  void specialAttack(DungeonCharacter hero){
	 	//split in two
		System.out.println("Gremlin special attack!");
		System.out.println("Gremlin splits in two, gaining 25hp!");
		this.hp += 25;

	 }
	
	

	//Added this as a possible add-on later. Currently unused
	public boolean canBlock(){return false;}
}