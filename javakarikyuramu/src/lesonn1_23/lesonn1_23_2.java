package lesonn1_23;

import java.util.Objects;

public class lesonn1_23_2 {

	  // フィールド	numberを作成
		private String number ;
		private String length ;
		private String speed ;
		
	
		// getterに送り出す
		public String getAnimalNumber() {
			return number ;
		}

		// getterに送り出す
		public String getAnimalLength() {
			return length ;
		}

		// getterに送り出す
		public String getAnimalSpeed() {
			return speed ;
		}
	
		// フィールドに値を代入(setter)
		public void setAnimalNumber(String number) {
			this.number = number; 

			// nullチェック
			Object obj = null;
			if(Objects.nonNull(obj)) {
				System.out.println("obj == null");
			}
		}

		// フィールドに値を代入(setter)
		public void setAnimalLength(String length) {
			this.length = length; 

			// nullチェック
			Object obj = null;
			if(Objects.nonNull(obj)) {
				System.out.println("obj == null");
			}
		}

		// フィールドに値を代入(setter)
		public void setAnimalSpeed(String speed) {
			this.speed = speed; 

			// nullチェック
			Object obj = null;
			if(Objects.nonNull(obj)) {
				System.out.println("obj == null");
			}
		}

}
