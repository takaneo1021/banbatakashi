package lesonn1_23;

import java.util.Objects;

public class lesonn1_23 {

		public static void main(String[] args) {
			/*
		 	
		 	下記がコンソールに出力されるように作成してください
		 	※thisとsetterとgetterとフィールドを使ってください
		 	
		  	動物名：ライオン
			体長：2.1m
			速度：80km/h
		 	
		 */
	      // クラスsetAnimalを作成
			setAnimal ani = new setAnimal();
			
	      // 代入する内容を作成
			String a = "動物名：ライオン\n"
					+ "	体長：2.1m\n"
					+ "	速度：80km/h";
			
	      // setAnimalのメソッドに送り出す(setter)
			ani.setAnimal(a);
			
	      // フィールドに値を取り出す（getter)
			System.out.println(ani.getAnimal());
		}
	
	}
	
	      // setAnimalクラス
	class setAnimal {
		
		  // フィールド	numberを作成
		private String number;
		
		  // nullチェック
		Object obj = null;
		
		  // getterに送り出す
		public String getAnimal() {
		    return number;
		}
		
		  // フィールドに値を代入(setter)
		public void setAnimal(String number) {
		    this.number = number;
		    
		  // nullチェック
		    Object obj = null;
		    if(Objects.isNull(obj)) {
		        System.out.println("obj == null");
		    }
		}
	}
		

