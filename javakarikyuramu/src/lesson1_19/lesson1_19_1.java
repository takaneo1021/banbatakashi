package lesson1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

	public class lesson1_19_1 {
	
		public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
				
	    // Dogを呼び出し
			Dog sub = new Dog();
	    // メソッドの呼び出し
			sub.publicMethod();
			
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
			
	    // DOGのクラスからnumberを取得。
			String num = sub.number;
			System.out.println(num);	
			
			
	    // 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
			
	    // 日付をコントロールに出力。
			Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
			System.out.println(df.format(date));
	
		}
	
	}
         // Dogのクラス作成
	class Dog {	
         // Q2の数の呼び出し。
		    public String number = "3";
		    
         // Q1の名前の呼び出し。
		    public void publicMethod() {
			System.out.println("シマウマ");
			
		}
	}


