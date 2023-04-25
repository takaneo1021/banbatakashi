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
			String a = "動物名：ライオン\n"
					+ "	体長：2.1m\n"
					+ "	速度：80km/h";
			
	      // setAnimalのメソッドに送り出す(setter)
			ani.setAnimal(a);
			
	      // フィールドに値を取り出す（getter)
			System.out.println(ani.getAnimal());
		}
	}