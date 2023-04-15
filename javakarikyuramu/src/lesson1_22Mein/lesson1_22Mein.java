package lesson1_22Mein;

import java.text.SimpleDateFormat;
import java.util.Date;

import lesson1_22.lesson1_22;

public class lesson1_22Mein {

	public static void main(String[] args) {
		 
//      日付を作成
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		
//		class lesson1_22を呼び出している
		lesson1_22 call = new lesson1_22("こんにちは！ここは日本です！", "この寿司はうまい", "寿司は和食です","今の現在日時は" + df.format(date) + "です");
		System.out.println( call.greeting);
		System.out.println( call.food);
		System.out.println( call.meal);
		System.out.println( call.day);
		
		
	}

}
