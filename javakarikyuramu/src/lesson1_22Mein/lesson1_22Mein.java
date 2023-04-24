package lesson1_22Mein;

import java.text.SimpleDateFormat;
import java.util.Date;

import lesson1_22.lesson1_22;

public class lesson1_22Mein {

	public static void main(String[] args) {
		 
// 日付を作成
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		
// class lesson1_22を呼び出している
		lesson1_22 call = new lesson1_22("日本", "寿司", "和食", df.format(date));
		System.out.println("こんにちは！ここは" + call.greeting + "です！");
		System.out.println("この" +  call.food + "はうまい");
		System.out.println(call.food + "は" + call.meal + "です");
		System.out.println("今の現在日時は" + call.day + "です");
		
	}
}
