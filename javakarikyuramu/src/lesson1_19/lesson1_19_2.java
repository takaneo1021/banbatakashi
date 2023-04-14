package lesson1_19;

	public class lesson1_19_2 {
	
		public static void main(String[] args) {
			// Q1：フィールドに動物の名前の変数を定義してください。
	
			// Q2：フィールドに動物の数の変数を定義してください。
	
			// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
			// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
			//		Q1のクラス作成
			Natural na = new Natural();
			System.out.println(na.bird);
	
			//		Q2のクラス作成
			Earth ea = new Earth(3);
			ea.assignment();
	
	
	
		}
	}
	
	//  クラス作成Q1
	class Natural{
	
	   // フィールド作成
		   String bird ;
	
		//		Q3 コントラクト作成
		   public Natural(){        
			bird = "犬" ;
		}
	}
	
	//	 Q2 クラス作成
	class Earth{
	
		//		 フィールド作成
		   private int hawk ;
	
		//		 Q4の引数を代入
		   Earth(int newPlace){
			  hawk = newPlace;
		}
	
		//		 Q4 コントラクト
		    public void assignment() {
			System.out.println(hawk);
		}
	}


