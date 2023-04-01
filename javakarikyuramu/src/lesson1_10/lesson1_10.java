package lesson1_10;

public class lesson1_10 {

	public static void main(String[] args) {
		/*
		問題.for文を使用し、以下のプログラムを作成してください。
		①変数iに1を代入
		②変数iに2ずつ足す処理を10回繰り返す。
			出力結果：  3
						5
						7
						9
						・
						・
						・
						21
						*/
		
		int i;
        for(i = 3; i <= 21; i = i + 2) {
	      System.out.println(i);
	    }
		
	}

}
