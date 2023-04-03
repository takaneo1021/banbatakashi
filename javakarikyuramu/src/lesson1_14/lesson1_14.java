package lesson1_14;

public class lesson1_14 {

	public static void main(String[] args) {
//		string型の配列を作成し、アルファベットa～jまでを格納してください。
//		brake文を使用し、a～dまで表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
//		          
//		cotinue文を使用し、i以外を表示してください。
	//	
//		 出力結果：a
//		           b
//		           c
//		           d
//		           e
//		           f
//		           g
//		           h
//		           j
		String letter[] = {"a","b","c","d","e","f","g","h","i","j"}; 


		for (int i = 0; i < letter.length; i++){
			if (i == 4){
				break;
			}
			System.out.println(letter[i]);
		}
		

		for (int i = 0; i < letter.length; i++){
			if (i == 8){
				continue;
			}
			System.out.println(letter[i]);
		}

	}

}
