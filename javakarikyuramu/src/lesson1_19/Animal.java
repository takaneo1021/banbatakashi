package lesson1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

import lessson1_19_2.Dog;

public class Animal {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
        // classDogを呼び出し。
		   Dog na = new Dog();
        // Naturalメソッドを呼び出し。
		   na.Natural();
			
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
        // Earthメソッドを呼び出し。
		   na.Earth(3);
			
	    // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
			
	    // 日付をコントロールに出力。
		    Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
			System.out.println(df.format(date));
	
		}
	
	}