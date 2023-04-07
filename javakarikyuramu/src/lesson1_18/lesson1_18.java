package lesson1_18;

import java.util.Arrays;

public class lesson1_18 {

	public static void main(String[] args) {
		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
			
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
				
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
			
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
      
		int number = 11;
		String greet = "Hello JavaSE";
		
		greeting(greet,number);
		
		int number1 = 2;
		
		integerMultiplication(number1,number1);
		
		
		int number3 ;
		number3 = arrangement(5);
		System.out.println(number3);
		
		number3 = arrangement(7);
		System.out.println(number3);
		
		double d = integerMultiplication(1.5,3.6);
		 System.out.println(d);
		 
		
		 int[] number5 = randomArrangement(5);
		 System.out.println(Arrays.toString(number5));
		 
		 double number6 = averageArrangement(5);
		 System.out.println(number6);
		 
		 String number7 = number6 > 50 ? "true" : "false";
		 System.out.println(number7);
		
	}
//	Q1
	private static void greeting(String a,int b){
		System.out.println(a + " " + b);
	}
	
//	Q2
	private static void integerMultiplication(int c,int d){
		System.out.println(c*d);
	}
	
//	Q3
	private static int arrangement(int e){
		return e ;
	}
	
//	Q4
	 private static double integerMultiplication(double d1, double d2){
		  return d1 + d2;
		}
	 
//	 Q5
	 private static int[] randomArrangement(int f){
		 int[] g = new int[f];
		 
//		 ランダムな数字を一つずつ作る
		 for (int i=0 ; i<f;i++) {
			 g[i] = (int)Math.ceil(Math.random() * 100) + 1;
			 
		 }
		 return g;
		
		}
	 
//	 Q6
	 private static double averageArrangement(int f){
        int[] j = randomArrangement(f);
        int sum = 0;
        
//        足し算
        for(int i : j) {
        	sum += i;
        }
//        double型に変える。割る。
        return (double)  sum / j.length;
	 }
}
