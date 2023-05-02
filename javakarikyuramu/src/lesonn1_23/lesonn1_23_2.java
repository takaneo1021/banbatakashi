package lesonn1_23;

import java.util.Objects;

public class lesonn1_23_2 {

	  // フィールド	numberを作成
		private String strName;
		private double bodLength;
		private int fasSpeed;
		
	
		// getterに送り出す
		public String getAnimalName() {
			return this.strName;
		}

		// getterに送り出す
		public double getAnimalLength() {
			return bodLength;
		}

		// getterに送り出す
		public int getAnimalSpeed() {
			return fasSpeed;
		}
	
		// フィールドに値を代入(setter)
		public void setAnimalName(String name) {
			// nullチェック
			if(Objects.isNull(name)){
				System.out.println("name == null");
				return;
			}
			this.strName = name; 
		}

		// フィールドに値を代入(setter)
		public void setAnimalLength(double length) {
			// nullチェック
			if(Objects.isNull(length)){
				System.out.println("length == null");
				return;
			}
			this.bodLength = length; 
		}

		// フィールドに値を代入(setter)
		public void setAnimalSpeed(int speed) {
			// nullチェック
			if(Objects.isNull(speed)){
				System.out.println("speed == null");
				return;
			}
			this.fasSpeed = speed; 
		}

}
