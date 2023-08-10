package lesson_27_kari;

import java.util.Scanner;

public class lesson_27_kari {

	/*
	 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */

	public static void main(String[] args) {

		// クラスlesoonlesson_27_kari2を呼び出している。
		lesson_27_kari2 syo = new lesson_27_kari2();

		// 区切りとしてScannerクラスを作成
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソール出力結果");
		System.out.println();
		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine();
		scanner.close();

		// コンマの区切りを設定。
		String[] animals = input.split(",");

		// コンマで区切られたな中身を繰り返し処理。
		for (String animalInfo : animals) {

		// :でさらに区切る。	
			String[] infoParts = animalInfo.split(":");

		// if文を使い、コンソールに出たものを割り当てる。    
			if (infoParts.length == 3) {
				String name = infoParts[0];
				String length = infoParts[1];
				String speed = infoParts[2];
				
        // String nameのセッター作成。lesoonlesson_27_kari2に送り出す。
				syo.setName(name);
				
		// コンソールに書き出す。
				System.out.println("動物名：" + name);
				System.out.println("体長：" + length + "m");
				System.out.println("速度：" + speed + "km/h");
				
		// ゲッターで選抜されたものを書き出す。		
				System.out.println("学名：" + syo.getScientificName());
				System.out.println();

			}
		}
	}
}

