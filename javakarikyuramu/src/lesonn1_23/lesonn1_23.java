package lesonn1_23;

public class lesonn1_23 {

		public static void main(String[] args) {
			/*
		 	
		 	下記がコンソールに出力されるように作成してください
		 	※thisとsetterとgetterとフィールドを使ってください
		 	
		  	動物名：ライオン
			体長：2.1m
			速度：80km/h
		 */
	      // クラスlesonn1_23_2を作成
			lesonn1_23_2 ani = new lesonn1_23_2();
			
			// 代入する内容を作成
			String name = "ライオン";
			double length = 2.1;
			int speed = 80;
			
	      // setAnimalのメソッドに送り出す(setter)
			ani.setAnimalName(name);
			ani.setAnimalLength(length);
			ani.setAnimalSpeed(speed);
			
	      // フィールドに値を取り出す（getter)
			System.out.println("動物名" + ani.getAnimalName());
			System.out.println("体長：" + ani.getAnimalLength() + "m");
			System.out.println("速度：" + ani.getAnimalSpeed() + "km/h");
		}
	}