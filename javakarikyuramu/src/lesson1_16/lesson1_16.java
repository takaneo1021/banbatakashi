package lesson1_16;

public class lesson1_16 {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。

				// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
					
				// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。

				// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
						
				// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。

				// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
				//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。

		String A = "A";
		System.out.println(A);
		
		A = "Hello Java";
		System.out.println(A);
		
		int mountain = 3776;
		System.out.println(mountain);
		
		double circumference = 3.14;
		System.out.println(circumference);
		
		int[] nums = {10,100,1000};
		int[] numes2 = nums;
		System.out.println(numes2[1]);
		
		int[] b = nums;
		b[0] = 8;
		System.out.println(nums[0]);

	}

}
