package lesson1_25_mein;

import java.util.Random;

import lesoon1_25_syori.status;

public class lesson1_25_mein {

	public static void main(String[] args) {
		
		status sta = new status();
		
		String name = "馬場貴嗣";
		
		Random rand = new Random();
		int HP = rand.nextInt(999)+1;
		int MP = rand.nextInt(999)+1;
		int Attack = rand.nextInt(999)+1;
		int Agility = rand.nextInt(999)+1;
		int Defense = rand.nextInt(999)+1;
		
		sta.setName(name);
		sta.setHP(HP);
		sta.setMP(MP);
		sta.setAttack(Attack);
		sta.setAgility(Agility);
		sta.setDefense(Defense);
		
		System.out.println("HP:" + sta.getHP());
		System.out.println("MP:" + sta.getMP());
		System.out.println("攻撃力:" + sta.getAttack());
		System.out.println("素早さ:" + sta.getAgility());
		System.out.println("防御力:" + sta.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
//		System.out.println(set.status());
	}
	}