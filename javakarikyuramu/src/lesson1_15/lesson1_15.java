package lesson1_15;

public class lesson1_15 {

	public static void main(String[] args) {
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点
			
		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		*/
		
		int test[][] = new int[4][];
		
		test[0] = new int[3];
		test[0][0] = 64;
		test[0][1] = 73;
		test[0][2] = 69;
		
		test[1] = new int[3];
		test[1][0] = 58;
		test[1][1] = 81;
		test[1][2] = 75;
		
		test[2] = new int[3];
		test[2][0] = 86;
		test[2][1] = 68;
		test[2][2] = 79;
		
		test[3] = new int[3];
		test[3][0] = 72;
		test[3][1] = 55;
		test[3][2] = 80;
		
		
	    System.out.println("生徒1：国語" + test[0][0] + "点、数学" + test[0][1] + "点、英語 " + test[0][2] + "点");
	    System.out.println("生徒2：国語" + test[1][0] + "点、数学" + test[1][1] + "点、英語 " + test[1][2] + "点");
	    System.out.println("生徒3：国語" + test[2][0] + "点、数学" + test[2][1] + "点、英語 " + test[2][2] + "点");
	    System.out.println("生徒4：国語" + test[3][0] + "点、数学" + test[3][1] + "点、英語 " + test[3][2] + "点");
		
	    int sum = 0;
	    for (int i = 0; i < 4; i++) {
	    	sum +=  test[i][0];
	    }
	    System.out.println("国語の平均点は" + (sum/4) + "点です。");
	    
	    int sum1 = 0;
	    for (int i = 0; i < 4; i++) {
	    	sum1 +=  test[i][1];
	    }
	    System.out.println("数学の平均点は" + (sum1/4) + "点です。");
	    
	    int sum2 = 0;
	    for (int i = 0; i < 4; i++) {
	    	sum2 +=  test[i][2];
	    }
	    System.out.println("英語の平均点は" + (sum2/4) + "点です。");
	    
    }
		
		
}







