package lesson1_22;

import java.util.Objects;

public class lesson1_22 {
	
//	フィールドを作成。
	public String greeting ; 
	public String food ;
	public String meal;
	public String day ;
	
//	thisを使いフィールド変数を定義。
	public lesson1_22 (String greeting,String food,String meal,String day) {
		
		this.greeting = greeting;
		this.food = food;
		this.meal = meal;
		this.day = day;
		
//		nullチェック
		
		String a = null;
		String b = greeting;

		if (Objects.nonNull(a)) {
			  System.out.print(a);
			} else {
			  System.out.print(b); 
			}
		
		
	}

}
