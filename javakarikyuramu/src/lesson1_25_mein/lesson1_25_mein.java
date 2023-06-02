package lesson1_25_mein;

import java.util.Scanner;

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

		// クラスlesoon1_25_sabuを呼び出している。
		lesoon1_25_sabu sta = new lesoon1_25_sabu();

		// コンソールから文字列を入力
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();

		// セッター作成。lesoon1_25_sabuに送り出す。
		sta.setName(name);
		
        // 処理されたものをメインに送る。	
		sta.StatusSab();
	}
}