package lesson1_25_mein;

import java.util.Random;

import lesoon1_25_syori.lesoon1_25_sabu;

public class lesson1_25_mein {
	
	/*
	 
	 名前を入力したら下記がコンソールに出力されるように作ってください
		条件：数値は毎回変わるように作ってください
		 	 サブクラスを使用してください
			 スーパークラスを使用してください
			 getterとsetterを使用してください
			 packageを2つ作ってメインと処理を分けてください
			 命名する場合は規則にのっとってください
			 コンストラクタを使用してください

		こんにちは 「 名前 」 さん
		ステータス
		HP：849
		MP：862
		攻撃力：375
		素早さ：937
		防御力：24

		さあ冒険に出かけよう！
	 
	 */

	public static void main(String[] args) {
		
//		クラスlesoon1_25_sabuを呼び出している。
		lesoon1_25_sabu sta = new lesoon1_25_sabu();
		
//		nameを宣言と代入
		String name = "名前";
		
//		ランダムの値を作成、代入
		Random rand = new Random();
		int HP = rand.nextInt(999)+1;
		int MP = rand.nextInt(999)+1;
		int Attack = rand.nextInt(999)+1;
		int Agility = rand.nextInt(999)+1;
		int Defense = rand.nextInt(999)+1;
		
//		セッター作成。lesoon1_25_sabuに送り出す。
		sta.Status(name);
		sta.setHP(HP);
		sta.setMP(MP);
		sta.setAttack(Attack);
		sta.setAgility(Agility);
		sta.setDefense(Defense);
		
//		ゲッターをlesoon1_25_sabuから呼び出しコンソール。
		System.out.println("HP:" + sta.getHP());
		System.out.println("MP:" + sta.getMP());
		System.out.println("攻撃力:" + sta.getAttack());
		System.out.println("素早さ:" + sta.getAgility());
		System.out.println("防御力:" + sta.getDefense());
		System.out.println("\r\nさあ冒険に出かけよう！");
	}
	}